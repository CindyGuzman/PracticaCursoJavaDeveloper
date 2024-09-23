/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.bancolombia.practicaprogramacionconcurrente;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author cieguzma
 */
public abstract class Cuenta implements Comparable<Cuenta> {
    
    protected int numero;
    protected LocalDate fechaApertura;
    protected double saldo;
    private LocalDate fechaCancelacion;
    
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    
    public Cuenta(int numero, double saldo, String fechaApertura) {
        this.numero = numero;
        this.saldo = saldo;
        this.fechaApertura = LocalDate.parse(fechaApertura, formatter);
    }
    
    @Override
    public int compareTo(Cuenta cuenta) {
        return Double.compare(this.saldo, cuenta.getSaldo());
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
    
    public LocalDate getFechaApertura(){
        return fechaApertura;
    }
    
    public LocalDate getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(LocalDate fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }
    
    public abstract void mostrarDetalles();
}
