/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.bancolombia.practicaprogramacionconcurrente;

/**
 *
 * @author cieguzma
 */
public class Domicilio {
    
    private String calle;
    private int numero;
    private String colonia;
    private String estado;
    private int codigoPostal; 
    
    public Domicilio(String calle, int numero, String colonia, String estado, int codigoPostal) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    
    public void mostrarInformacionDomicilio() {
    System.out.println("---------- Informacion de Domilicio ----------");
    System.out.println("Calle: " + calle);
    System.out.println("Numero: " + numero);
    System.out.println("Colonia: " + colonia);
    System.out.println("Estado: " + estado);
    System.out.println("Codigo Postal: " + codigoPostal);
    System.out.println("------------------------------------------");
    }
    
}
