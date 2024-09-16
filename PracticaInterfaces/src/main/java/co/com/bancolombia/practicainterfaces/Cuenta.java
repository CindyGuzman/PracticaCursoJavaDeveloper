/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.bancolombia.practicainterfaces;

/**
 *
 * @author cieguzma
 */
public abstract class Cuenta {
    
    protected int numero;
    protected String fechaApertura;
    protected double saldo;
    private String fechaCancelacion;
    
    public Cuenta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
        this.fechaApertura = "13-09-2024";
    }
    
    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero= numero;
    }
    
    public Double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo= saldo;
    }
    
    public String getFechaApertura(){
        return fechaApertura;
    }
    
    public String getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(String fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }
    
    public abstract void mostrarDetalles();
}
