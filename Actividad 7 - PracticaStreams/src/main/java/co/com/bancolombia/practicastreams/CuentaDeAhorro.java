/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.bancolombia.practicastreams;

/**
 *
 * @author cieguzma
 */
public class CuentaDeAhorro extends Cuenta {
    
    private double tasaInteresMensual;
    
    public CuentaDeAhorro (int numero, double saldo, double tasaInteresMensual) {
        super(numero, saldo);
        this.tasaInteresMensual = tasaInteresMensual;
    }
    
    public Double getTasaInteresMensual() {
        return tasaInteresMensual;
    }
    
    public void setTasaInteresMensual(double tasaInteresMensual) {
        this.tasaInteresMensual= tasaInteresMensual;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Cuenta de Ahorro:");
        System.out.println("Número: " + numero);
        System.out.println("Saldo: " + saldo);
        System.out.println("Fecha de Apertura: " + fechaApertura);
        System.out.println("Tasa de Interés Mensual: " + tasaInteresMensual + "%");
    }
    
}
