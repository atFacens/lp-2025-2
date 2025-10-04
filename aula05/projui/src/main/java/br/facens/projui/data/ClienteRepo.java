/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.facens.projui.data;

import br.facens.projui.models.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emers
 */
public class ClienteRepo {
    private List<Cliente> listaClientes;
    
    public ClienteRepo() {
        listaClientes = new ArrayList<>();
    }
    
    public void novoCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }
    
    public String listarClientes() {
        String nomes = "";
        for (Cliente cliente : listaClientes) {
            nomes += cliente.getNome() +  " - " + cliente.getEmail()+"\n";
        }
        return nomes;
    }
}
