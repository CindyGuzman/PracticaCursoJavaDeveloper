/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.bancolombia.practicaparallelstreams;

/**
 *
 * @author cieguzma
 */

public class Main {

    public static void main(String[] args) {
                        
        Domicilio cliente1Domicilio = new Domicilio("Calle 12 AA Sur", 55, "Sur", "Medellin", 546789);
        Cliente cliente1 = new Cliente(1, "Juan Soto", cliente1Domicilio, "RFC1", "555-1234", "01-01-1990");

        CuentaDeAhorro cuenta1 = new CuentaDeAhorro(45678, 5000.0, "01-01-2021", 1.5);
        CuentaDeCheque cuenta2 = new CuentaDeCheque(98765, 3000.0, "05-05-2022", 1.2);
        
        cliente1.agregarCuenta(cuenta1);
        cliente1.agregarCuenta(cuenta2);
        
        cliente1.mostrarInformacionCliente();
        cliente1.getCuentas().forEach(Cuenta::mostrarDetalles);
        
        System.out.println("\n--- Abonar a la cuenta1 ---");
        cliente1.abonarCuenta(45678, 1500.0);
        cliente1.getCuentas().forEach(Cuenta::mostrarDetalles);
        
        System.out.println("\n--- Retirar de la cuenta2 ---");
        cliente1.retirarCuenta(98765, 500.0);
        cliente1.getCuentas().forEach(Cuenta::mostrarDetalles);
        
        System.out.println("\n--- Cancelar la cuenta1 ---");
        cliente1.cancelarCuenta(45678);
        cliente1.getCuentas().forEach(Cuenta::mostrarDetalles);
        
        Domicilio bancoDomicilio = new Domicilio("Carrera 45", 54, "Centro", "Medellin", 546709);
        Banco banco = new Banco("Bancolombia", bancoDomicilio, "RFC321", "5999999");
       
        banco.adicionarCliente(cliente1);
        banco.mostrarInformacionBanco();
        
        System.out.println("\n--- Consultar cliente1 ---");
        banco.consultarCliente(1);
        cliente1.getCuentas().forEach(Cuenta::mostrarDetalles);
    }
    
}