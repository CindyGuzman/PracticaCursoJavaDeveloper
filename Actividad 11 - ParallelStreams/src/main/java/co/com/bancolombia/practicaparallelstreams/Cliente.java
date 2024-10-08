/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.bancolombia.practicaparallelstreams;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author cieguzma
 */
public class Cliente implements ServicioCuentas, Comparable<Cliente> {
    
    private int numero;
    private String nombre;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;
    private final List<Cuenta> cuentas;
    private LocalDate fechaNacimiento;
    
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    
    public Cliente(int numero, String nombre, Domicilio domicilio, String rfc, String telefono, String fechaNacimiento) {
        this.numero = numero;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.rfc = rfc;
        this.telefono = telefono;
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, formatter);;
        this.cuentas = new ArrayList<>();
    }
   
    
    public void adicionarCuenta(Cuenta cuenta) {
    cuentas.add(cuenta);
    }
    
        
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, formatter);
    }
    
    public List<Cuenta> getCuentas() {
        return cuentas;
    }
        
    @Override
    public boolean agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
        System.out.println("Cuenta agregada: " + cuenta.getNumero());
        return true;
    }
    
    @Override
    public int compareTo(Cliente cliente) {
        return Integer.compare(this.numero, cliente.numero);
    }
    
    @Override
    public boolean cancelarCuenta(int numeroCuenta) {
    Optional<Cuenta> cuentaOpt = cuentas.parallelStream()  
            .filter(c -> c.getNumero() == numeroCuenta)
            .findFirst();
    
    if (cuentaOpt.isPresent()) {
        cuentaOpt.get().setFechaCancelacion(LocalDate.now());
        System.out.println("Cuenta cancelada: " + numeroCuenta);
        return true;
    }
    
    System.out.println("Cuenta no encontrada: " + numeroCuenta);
    return false;
    }
    
    @Override
    public void abonarCuenta(int numeroCuenta, double monto) {
            cuentas.parallelStream() 
            .filter(c -> c.getNumero() == numeroCuenta)
            .findFirst()
            .ifPresentOrElse(cuenta -> {
                cuenta.setSaldo(cuenta.getSaldo() + monto);
                System.out.println("Se abonaron " + monto + " a la cuenta: " + numeroCuenta);
            }, () -> System.out.println("Cuenta no encontrada: " + numeroCuenta));
}
    
    @Override
    public void retirarCuenta(int numeroCuenta, double monto) {
        cuentas.parallelStream()
            .filter(c -> c.getNumero() == numeroCuenta)
            .findFirst()
            .ifPresentOrElse(cuenta -> {
                if (cuenta.getSaldo() >= monto) {
                    cuenta.setSaldo(cuenta.getSaldo() - monto);
                    System.out.println("Se retiraron " + monto + " de la cuenta: " + numeroCuenta);
                } else {
                    System.out.println("Saldo insuficiente en la cuenta: " + numeroCuenta);
                }
            }, () -> System.out.println("Cuenta no encontrada: " + numeroCuenta));
}
    
    @Override
    public List<Cuenta> obtenerCuentas() {
        return new ArrayList<>(cuentas);
    }
    
    public void mostrarInformacionCliente() {
    System.out.println("---------- Informacion de Cliente ----------");
    System.out.println("Nombre Cliente: " + nombre);
    System.out.println("Numero Cliente: " + numero);
    System.out.println("Rfc Cliente: " + rfc);
    System.out.println("Telefono Cliente: " + telefono);
    System.out.println("Fecha de Nacimiento Cliente: " + fechaNacimiento);
    System.out.println("------------------------------------------");
    }
  
}
