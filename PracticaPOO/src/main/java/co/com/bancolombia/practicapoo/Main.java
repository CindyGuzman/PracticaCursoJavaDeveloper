/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.bancolombia.practicapoo;

/**
 *
 * @author cieguzma
 */
public class Main {
    
        public static void main(String[] args) {
            
            Domicilio bancoDomicilio = new Domicilio("Carrera 45", 54, "Centro", "Medellin", 546709);
            Banco banco = new Banco("Bancolombia", bancoDomicilio, "RFC321", "5999999");
            
            Domicilio clienteDomicilio = new Domicilio("Calle 12 AA Sur", 55, "Sur", "Medellin", 546789);
            Cliente primerCliente = new Cliente(12345, "Cindy", clienteDomicilio, "RFC4321", "3223454321", "1995-06-06");
            
            CuentaDeAhorro cuentaAhorro = new CuentaDeAhorro( 654321, 500000, 2.5);
            CuentaDeCheque cuentaCheque = new CuentaDeCheque( 78901, 400000, 15);
            
            primerCliente.adicionarCuenta(cuentaAhorro);
            primerCliente.adicionarCuenta(cuentaCheque);
        
            banco.adicionarCliente(primerCliente);
            
            primerCliente.mostrarInformacionCliente();
            banco.mostrarInformacionBanco();

    }
}
