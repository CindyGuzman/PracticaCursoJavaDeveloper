/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.bancolombia.practicainterfaces;

/**
 *
 * @author cieguzma
 */
public class Main {
    
        public static void main(String[] args) {
            
            Domicilio bancoDomicilio = new Domicilio("Carrera 45", 54, "Centro", "Medellin", 546709);
            Banco banco = new Banco("Bancolombia", bancoDomicilio, "RFC321", "5999999");
            
            Domicilio clienteDomiciliouno = new Domicilio("Calle 12 AA Sur", 55, "Sur", "Medellin", 546789);
            Cliente primerCliente = new Cliente(12345, "Cindy", clienteDomiciliouno, "RFC4321", "3223454321", "1995-06-06");
            
            
            Domicilio clienteDomicilioDos = new Domicilio("Calle 15 Sur", 54, "Sur", "Itagui", 98765);
            Cliente segundoCliente = new Cliente(54321, "Karen", clienteDomicilioDos, "RFC1234", "3223454321", "1994-07-06");
            
            
            CuentaDeAhorro cuentaAhorro = new CuentaDeAhorro( 654321, 500000, 2.5);
            CuentaDeCheque cuentaCheque = new CuentaDeCheque( 78901, 400000, 15);
            CuentaDeCheque cuentaChequeDos = new CuentaDeCheque( 4321, 400090, 15);
            
            primerCliente.adicionarCuenta(cuentaAhorro);
            primerCliente.adicionarCuenta(cuentaCheque);
            
            segundoCliente.adicionarCuenta(cuentaChequeDos);
            segundoCliente.abonarCuenta(4321, 20000);
        
            banco.adicionarCliente(primerCliente);
            banco.adicionarCliente(segundoCliente);
            
            primerCliente.mostrarInformacionCliente();
            banco.mostrarInformacionBanco();
            
            banco.consultarCliente(12345);
    }
}
