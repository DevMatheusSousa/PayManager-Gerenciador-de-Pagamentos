package com.PayManger.pagamentos.App;

import com.PayManger.pagamentos.model.Cliente;
import com.PayManger.pagamentos.model.Pedido;
import com.PayManger.pagamentos.model.Pessoa;
import com.PayManger.pagamentos.model.Produto;
import com.PayManger.pagamentos.service.ClienteService;
import com.PayManger.pagamentos.service.FormasDePagamento;

import java.util.ArrayList;
import java.util.List;
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

        System.out.print("Digite seu id: ");
        Long saldo = scanner.nextLong();
        scanner.nextLine();




        Cliente matheus = new Cliente(meuId, meuNome, meuCpf, meuEmail, saldo);
        List<Produto> listaDeProduto = new ArrayList<>();
        listaDeProduto.add(new Produto("Pc gamer", 2500D ));
        FormasDePagamento pagamento = new FormasDePagamento();
        pagamento.pagamentoBoleto("1231241234123123");

        matheus.adicionarPedido(new Pedido(matheus, listaDeProduto, pagamento ));


    }
}
