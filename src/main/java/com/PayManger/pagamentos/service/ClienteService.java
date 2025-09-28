package com.PayManger.pagamentos.service;

import com.PayManger.pagamentos.model.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu id: ");
        Integer meuId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite seu nome: ");
        String meuNome = scanner.nextLine();

        System.out.print("Digite seu cpf: ");
        Long meuCpf = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Digite seu email: ");
        String meuEmail = scanner.nextLine();

        if (!cliente.getEmail().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
            System.out.println("Cliente nao cadastrado email invalido!");
            return false;
        }

        System.out.print("Digite seu id: ");
        Long saldo = scanner.nextLong();
        scanner.nextLine();


        Cliente clienteCadastrado = new Cliente(meuId, meuNome, meuCpf, meuEmail, saldo);
        listaDeClientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
        return true;
    }
}
