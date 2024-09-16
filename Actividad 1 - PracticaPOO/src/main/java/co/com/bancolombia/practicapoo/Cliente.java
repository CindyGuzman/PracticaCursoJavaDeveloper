/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.bancolombia.practicapoo;

import java.util.ArrayList;

/**
 *
 * @author cieguzma
 */
public class Cliente {
    
    private int numero;
    private String nombre;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;
    private final ArrayList<Cuenta> cuentas;
    private String fechaNacimiento;
    
    public Cliente(int numero, String nombre, Domicilio domicilio, String rfc, String telefono, String fechaNacimiento) {
        this.numero = numero;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.rfc = rfc;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
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

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void mostrarInformacionCliente() {
    System.out.println("---------- Informacion de Cliente ----------");
    System.out.println("Nombre Cliente: " + nombre);
    System.out.println("Numero Cliente: " + numero);
    System.out.println("Domicilio Cliente: " + domicilio);
    System.out.println("Rfc Cliente: " + rfc);
    System.out.println("Telefono Cliente: " + telefono);
    System.out.println("Fecha de Nacimiento Cliente: " + fechaNacimiento);
    System.out.println("------------------------------------------");
    }
    
}
