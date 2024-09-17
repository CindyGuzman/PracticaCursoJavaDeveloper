/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.bancolombia.practicastreams;

import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author cieguzma
 */
public class Banco implements ServicioClientes {
    
    private String nombre;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;
    private final ArrayList<Cliente> clientes;
    
    public Banco(String nombre, Domicilio domicilio, String rfc, String telefono) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.rfc = rfc;
        this.telefono = telefono;
        this.clientes = new ArrayList<>();
    }
    
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
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

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    public void mostrarInformacionBanco() {
    System.out.println("---------- Informacion de Banco ----------");
    System.out.println("Nombre Banco: " + nombre);
    System.out.println("Domicilio Banco: " + domicilio);
    System.out.println("Rfc Banco: " + rfc);
    System.out.println("Telefono Banco: " + telefono);
    System.out.println("Cliente del banco: " + clientes);
    System.out.println("------------------------------------------");
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        boolean existe = clientes.stream()
                .anyMatch(c -> c.getNumero() == cliente.getNumero());
        if (existe) {
            System.out.println("El cliente ya existe: " + cliente.getNumero());
            return false;
        }
        clientes.add(cliente);
        System.out.println("Cliente agregado: " + cliente.getNumero());
        return true;
    }
    
    @Override
    public boolean eliminarCliente(int numeroCliente) {
        Optional<Cliente> clienteOpt = clientes.stream()
                .filter(c -> c.getNumero() == numeroCliente)
                .findFirst();
        
        if (clienteOpt.isPresent()) {
            clientes.remove(clienteOpt.get());
            System.out.println("Cliente eliminado: " + numeroCliente);
            return true;
        }
        
        System.out.println("Cliente no encontrado: " + numeroCliente);
        return false;
    }
    
    @Override
    public Cliente consultarCliente(int numeroCliente) {
        return clientes.stream()
                .filter(c -> c.getNumero() == numeroCliente)
                .findFirst()
                .orElseGet(() -> {
                    System.out.println("Cliente no encontrado: " + numeroCliente);
                    return null;
                });
    }
    
    @Override
    public ArrayList<Cliente> obtenerClientes() {
        return new ArrayList<>(clientes);
    }
    
    @Override
    public Cliente buscarClientePorRfc(String rfc) {
        return clientes.stream()
                .filter(c -> c.getRfc().equals(rfc))
                .findFirst()
                .orElseGet(() -> {
                    System.out.println("Cliente no encontrado por RFC: " + rfc);
                    return null;
                });
    }
    
}
