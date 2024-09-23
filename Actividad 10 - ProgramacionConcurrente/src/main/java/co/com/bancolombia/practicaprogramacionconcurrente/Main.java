/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 
package co.com.bancolombia.practicaprogramacionconcurrente;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author cieguzma
 */


public class Main {
    
    public static void main(String[] args) throws Exception {
        
        ExecutorService executor = Executors.newSingleThreadExecutor();
        
        List<Future<Cuenta>> futures = new ArrayList<>();
        
        Future<?> futureReading = executor.submit(() -> {
            try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/co/com/bancolombia/practicaprogramacionconcurrente/cuentas.txt"))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    Callable<Cuenta> task = new CrearCuentaCallable(linea);
                    Future<Cuenta> future = executor.submit(task);
                    futures.add(future);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        futureReading.get();

        for (Future<Cuenta> future : futures) {
            try {
                Cuenta cuenta = future.get();
                System.out.println("Cuenta obtenida: ");
                cuenta.mostrarDetalles();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
    }
}

class CrearCuentaCallable implements Callable<Cuenta> {

    private final String linea;

    public CrearCuentaCallable(String linea) {
        this.linea = linea;
    }

    @Override
    public Cuenta call() throws Exception {
        // Procesar la línea del archivo
        String[] partes = linea.split(",");
        int numeroCuenta = Integer.parseInt(partes[0]);
        String fechaApertura = partes[1];
        double saldo = Double.parseDouble(partes[2]);
        double tasaInteresMensual = Double.parseDouble(partes[3]);

        return new CuentaDeAhorro(numeroCuenta, saldo, fechaApertura, tasaInteresMensual);
        
    }
}
