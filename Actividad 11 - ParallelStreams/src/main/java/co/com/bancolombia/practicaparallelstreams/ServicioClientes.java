/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.com.bancolombia.practicaparallelstreams;

import java.util.ArrayList;

/**
 *
 * @author cieguzma
 */
public interface ServicioClientes {
    
    boolean agregarCliente (Cliente cliente);
    
    boolean eliminarCliente (int numero);
    
    Cliente consultarCliente (int numero);
    
    ArrayList<Cliente> obtenerClientes();
    
    Cliente buscarClientePorRfc (String rfc);
    
}
