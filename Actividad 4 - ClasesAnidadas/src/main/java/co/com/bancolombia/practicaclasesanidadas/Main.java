/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.bancolombia.practicaclasesanidadas;

/**
 *
 * @author cieguzma
 */

public class Main {

    public static void main(String[] args) {
        
        Domicilio cliente1Domicilio = new Domicilio("Calle 12 AA Sur", 55, "Sur", "Medellin", 546789);

        Cliente cliente1 = new Cliente.Builder(1, "Carlos Pérez")
            .domicilio(cliente1Domicilio)
            .rfc("RFC001")
            .telefono("555-1234")
            .fechaNacimiento("01-01-1980")
            .build();

        // Crear un Cliente con solo los atributos obligatorios
        Cliente cliente2 = new Cliente.Builder(2, "Ana García")
            .build();

        Cuenta cuentaCheque1 = new CuentaDeCheque(101, 5000, 3.0); 
        Cuenta cuentaAhorro1 = new CuentaDeAhorro(102, 3000, 1.5); 

        Cuenta cuentaCheque2 = new CuentaDeCheque(103, 7000, 3.0); 
        Cuenta cuentaAhorro2 = new CuentaDeAhorro(104, 10000, 2.0);

        
        cliente1.agregarCuenta(cuentaCheque1);
        cliente1.agregarCuenta(cuentaAhorro1);

        cliente2.agregarCuenta(cuentaCheque2);
        cliente2.agregarCuenta(cuentaAhorro2);
        
        cliente1.mostrarInformacionCliente();
        cliente2.mostrarInformacionCliente();
    }
}