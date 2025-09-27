package com.PayManger.pagamentos.service;

import com.PayManger.pagamentos.model.Produto;

public class ProdutoService{
    public Double calcularPrecoFinal(Produto produto) {
       Double preco = produto.getPreco();
       Double desconto = produto.getDesconto();
        if(preco > 250){
            preco -= desconto;
        }
        System.out.println("Preço final do produto: R$ " + preco);
        return  preco;
    }
}
