package com.PayManger.pagamentos.App;

import com.PayManger.pagamentos.model.Cliente;
import com.PayManger.pagamentos.model.Pessoa;
import com.PayManger.pagamentos.service.ClienteService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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



        ClienteService clienteService = new ClienteService();

        Cliente cliente = new Cliente(12, "Matheus Sousa", 70624258181L, "matheusdev@gmail.com");

        clienteService.adicionarCliente(cliente);


        clienteService.listarCliente();
        clienteService.cadastrarCliente(new Cliente(meuId, meuNome, meuCpf, meuEmail));
    }
}
