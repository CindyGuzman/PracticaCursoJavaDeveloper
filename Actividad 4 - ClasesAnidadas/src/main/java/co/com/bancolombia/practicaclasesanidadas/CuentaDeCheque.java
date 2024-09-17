/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.bancolombia.practicaclasesanidadas;

/**
 *
 * @author cieguzma
 */
public class CuentaDeCheque extends Cuenta {
    
    private double costoManejoMensual;
    
    public CuentaDeCheque (int numero, double saldo, double costoManejoMensual) {
        super(numero, saldo);
        this.costoManejoMensual = costoManejoMensual;
    }
    
        public Double getCostoManejoMensual() {
        return costoManejoMensual;
    }
    
    public void setCostoManejoMensual(double costoManejoMensual) {
        this.costoManejoMensual= costoManejoMensual;
    }
    
            @Override
    public void mostrarDetalles() {
        System.out.println("Cuenta de Ahorro:");
        System.out.println("Número: " + numero);
        System.out.println("Saldo: " + saldo);
        System.out.println("Fecha de Apertura: " + fechaApertura);
        System.out.println("Costo Manejo Mensual de Cuenta: " + costoManejoMensual + "%");
    }
}
