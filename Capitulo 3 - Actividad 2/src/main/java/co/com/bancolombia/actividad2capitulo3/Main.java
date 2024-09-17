/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.bancolombia.actividad2capitulo3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author cieguzma
 */

public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        int INDICE = 500_000;
        long inicio = 0;

        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add("Cadena numero: " + i);
            linkedList.add("Cadena numero: " + i);
        }

        System.out.println("Tiempo invertido en insertar una cadena usando ArrayList");
        inicio = System.nanoTime(); // Tiempo inicial
        arrayList.add(INDICE, "Otra cadena por agregar"); // Insertar en el índice especificado
        System.out.println(System.nanoTime() - inicio); // Imprimir tiempo de inserción

        System.out.println("Tiempo invertido en insertar una cadena usando LinkedList");
        inicio = System.nanoTime(); // Tiempo inicial
        linkedList.add(INDICE, "Otra cadena por agregar"); 
        System.out.println(System.nanoTime() - inicio); 
        
        System.out.println("Tiempo invertido en eliminar una cadena usando ArrayList");
        inicio = System.nanoTime();
        arrayList.remove(INDICE);
        System.out.println(System.nanoTime() - inicio);

        System.out.println("Tiempo invertido en eliminar una cadena usando LinkedList");
        inicio = System.nanoTime();
        linkedList.remove(INDICE);
        System.out.println(System.nanoTime() - inicio);
        
        
        System.out.println("Tiempo invertido en recuperar una cadena usando ArrayList");
        inicio = System.nanoTime();
        String elementoRecuperado = arrayList.get(INDICE);
        System.out.println(System.nanoTime() - inicio);

        System.out.println("Tiempo invertido en recuperar una cadena usando LinkedList");
        inicio = System.nanoTime();
        elementoRecuperado = linkedList.get(INDICE);
        System.out.println(System.nanoTime() - inicio);
        
    }
}