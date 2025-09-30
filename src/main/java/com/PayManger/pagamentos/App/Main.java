package com.PayManger.pagamentos.App;

import com.PayManger.pagamentos.model.Cliente;
import com.PayManger.pagamentos.model.Pedido;
import com.PayManger.pagamentos.model.Produto;
import com.PayManger.pagamentos.model.FormasDePagamento;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


//        FormasDePagamento pagamento = new FormasDePagamento();
//        pagamento.pagamentoBoleto("1231241234123123");





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


