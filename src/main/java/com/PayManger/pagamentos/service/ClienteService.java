package com.PayManger.pagamentos.service;

import com.PayManger.pagamentos.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteService {

    private List<Cliente> listaDeClientes = new ArrayList<>();

    public void listarCliente() {
        if (listaDeClientes.isEmpty()) {
            System.out.println("Nenhum cliente encontrado!");
        } else {
            listaDeClientes.forEach(System.out::println);
        }
    }

    public boolean cadastrarCliente(Cliente cliente) {

        if (!cliente.getEmail().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
            System.out.println("Cliente nao cadastrado email invalido!");
            return false;
        }
        listaDeClientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
        return true;
    }
}
