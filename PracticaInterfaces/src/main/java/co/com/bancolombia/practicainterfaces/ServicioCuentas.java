/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.com.bancolombia.practicainterfaces;

import java.util.ArrayList;

/**
 *
 * @author cieguzma
 */
public interface ServicioCuentas {
    
    // Método para agregar una nueva cuenta
    boolean agregarCuenta(Cuenta cuenta);
    
    // Método para cancelar una cuenta
    boolean cancelarCuenta(int numero);
    
    // Método para abonar a una cuenta
    void abonarCuenta(int numeroCuenta, double abono);
    
    // Método para retirar de una cuenta
    void retirarCuenta(int numeroCuenta, double retiro);
    
    // Método para obtener las cuentas asociadas
    ArrayList<Cuenta> obtenerCuentas();
    
}
