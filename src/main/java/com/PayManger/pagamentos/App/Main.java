package com.PayManger.pagamentos.App;

import com.PayManger.pagamentos.model.Cliente;
import com.PayManger.pagamentos.model.Pessoa;
import com.PayManger.pagamentos.service.ClienteService;

public class Main {
    public static void main(String[] args) {

        ClienteService clienteService = new ClienteService();

        Cliente cliente = new Cliente(12, "Matheus Sousa", 70624258181L, "matheusdev@gmail.com");

        clienteService.adicionarCliente(cliente);
        clienteService.listarCliente();
    }
}
