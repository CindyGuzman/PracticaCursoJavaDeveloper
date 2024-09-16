/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.bancolombia.practicaordenamiento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author cieguzma
 */

public class Main {

    public static void main(String[] args) {
        
        Domicilio cliente1Domicilio = new Domicilio("Calle 12 AA Sur", 55, "Sur", "Medellin", 546789);
        Domicilio cliente2Domicilio = new Domicilio("Calle 15 Sur", 54, "Sur", "Itagui", 98765);


        // Creación de clientes
        Cliente cliente1 = new Cliente(1, "Carlos Pérez", cliente1Domicilio, "RFC001", "555-1234", "01-01-1980");
        Cliente cliente2 = new Cliente(2, "Ana García", cliente2Domicilio, "RFC002", "555-5678", "05-06-1985");

        // Lista de clientes
        List<Cliente> listaClientes = new ArrayList<>();
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);

        // Aquí usamos Collections.sort() para ordenar clientes por número
        Collections.sort(listaClientes);

        // Mostrar la lista de clientes ordenada
        System.out.println("Clientes ordenados por número:");
        for (Cliente cliente : listaClientes) {
            cliente.mostrarInformacionCliente();
        }
    }
}