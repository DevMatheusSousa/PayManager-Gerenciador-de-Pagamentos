package com.PayManger.pagamentos.App;

import com.PayManger.pagamentos.model.Cliente;
import com.PayManger.pagamentos.model.Pedido;
import com.PayManger.pagamentos.model.Produto;
import com.PayManger.pagamentos.model.FormasDePagamento;
import com.PayManger.pagamentos.service.ClienteService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);
    Cliente cliente1;
    public void menuInterativo(){
        int iniciarSistema = 1;
        do {


            System.out.println("----Loja de Camisetas-----");

            System.out.println("'1 -> Cadastrar cliente!");
            System.out.println("'2 -> Listar cliente!");
            System.out.println("'3 -> Cadastrar Produto!");
            System.out.println("'4 -> Listar Produto!");
            System.out.println("'5 -> Finalizar Pagamento!");
            System.out.println("'0 -> Para sair!");

            System.out.print("Escolha uma opcao: ");

            int opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    ClienteService clienteService = new ClienteService();
                    clienteService.cadastrarCliente(cliente1);



            }
        }while(iniciarSistema != 0);

    }
    public static void main(String[] args) {


//        FormasDePagamento pagamento = new FormasDePagamento();
//        pagamento.pagamentoBoleto("1231241234123123");




        Main test = new Main();
        test.menuInterativo();




        Cliente cliente1 = new Cliente(1, "Matheus", 70624258181L,"dev.matheus@gmail.com");
        Produto produto1 = new Produto();
        List<Produto> listaDeProduto = new ArrayList<>();
        listaDeProduto.add(new Produto("Pc gamer", 2500D ));


        FormasDePagamento pagamento = new FormasDePagamento();
        pagamento.pagamentoPix("70624258181");

        cliente1.adicionarPedido(new Pedido(cliente1, listaDeProduto, pagamento));
        Pedido pedido = new Pedido(cliente1, listaDeProduto, pagamento);
        System.out.println(pedido);
        // matheus.adicionarPedido(new Pedido(matheus, listaDeProduto, pagamento ));


    }
}


