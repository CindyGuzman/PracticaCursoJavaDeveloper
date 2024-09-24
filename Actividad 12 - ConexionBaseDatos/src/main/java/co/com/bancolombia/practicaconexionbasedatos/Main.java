/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.bancolombia.practicaconexionbasedatos;

/**
 *
 * @author cieguzma
 */

public class Main {

    public static void main(String[] args) {
                        
        Domicilio domicilioBanco = new Domicilio("Calle Principal", 123, "Centro", "CDMX", 12345);
        Banco banco = new Banco("Banco Ejemplo", domicilioBanco, "BAN1234567H", "555-1234");

        Domicilio domicilioCliente1 = new Domicilio("Calle 1", 101, "Colonia 1", "Estado 1", 54321);
        Cliente cliente1 = new Cliente(1, "Juan Perez", domicilioCliente1, "JUAP880101", "555-1111", "01-01-1980");

        Domicilio domicilioCliente2 = new Domicilio("Calle 2", 102, "Colonia 2", "Estado 2", 54322);
        Cliente cliente2 = new Cliente(2, "Ana Garcia", domicilioCliente2, "ANGA880102", "555-2222", "02-02-1982");

        Domicilio domicilioCliente3 = new Domicilio("Calle 3", 103, "Colonia 3", "Estado 3", 54323);
        Cliente cliente3 = new Cliente(3, "Luis Martinez", domicilioCliente3, "LUMA880103", "555-3333", "03-03-1983");

        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);
        banco.adicionarCliente(cliente3);

        banco.cargarCuentasDesdeBD();

        cliente1.mostrarInformacionCliente();
        cliente2.mostrarInformacionCliente();
        cliente3.mostrarInformacionCliente();
    }
    
}