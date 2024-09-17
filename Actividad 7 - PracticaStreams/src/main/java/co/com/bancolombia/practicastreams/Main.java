/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.bancolombia.practicastreams;

/**
 *
 * @author cieguzma
 */

public class Main {

    public static void main(String[] args) {
        
        Domicilio bancoDomicilio = new Domicilio("Carrera 45", 54, "Centro", "Medellin", 546709);
        Banco banco = new Banco("Bancolombia", bancoDomicilio, "RFC321", "5999999");
        
        Domicilio cliente1Domicilio = new Domicilio("Calle 12 AA Sur", 55, "Sur", "Medellin", 546789);
        Domicilio cliente2Domicilio = new Domicilio("Calle 15 Sur", 54, "Sur", "Itagui", 98765);
        Cliente cliente1 = new Cliente(1, "Carlos Pérez", cliente1Domicilio, "RFC001", "555-1234", "01-01-1980");
        Cliente cliente2 = new Cliente(2, "Ana García", cliente2Domicilio, "RFC002", "555-5678", "05-06-1985");

        banco.agregarCliente(cliente1);
        banco.agregarCliente(cliente2);
        
        banco.mostrarInformacionBanco();

        banco.consultarCliente(1);

        banco.eliminarCliente(1);

        banco.buscarClientePorRfc("RFC2");

        CuentaDeCheque cuentaCheque = new CuentaDeCheque( 78901, 400000, 15);
        cliente2.adicionarCuenta(cuentaCheque);
        cliente2.agregarCuenta(cuentaCheque);
        cliente2.abonarCuenta(78901, 200.0);
        cliente2.retirarCuenta(78901, 100.0);
        cliente2.cancelarCuenta(78901);
    }
}