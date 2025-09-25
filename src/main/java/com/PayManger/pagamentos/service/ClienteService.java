package com.PayManger.pagamentos.service;

import com.PayManger.pagamentos.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteService {

    private List<Cliente> listaDeClientes = new ArrayList<>();

    public void adicionarCliente(Cliente cliente){
        listaDeClientes.add(cliente);
    }

    public void listarCliente(){
        if(listaDeClientes.isEmpty()){
            System.out.println("Nenhum cliente encontrado!");
        }else {
            listaDeClientes.forEach(System.out::println);
        }
    }
}
