package com.PayManger.pagamentos.model;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nomeProduto;
    private Double preco;
    private Double desconto = 0.10;

    private List<Cliente> clientes = new ArrayList<>();
    public Produto() {

    }

    public Produto(String nomeProduto, Double preco){
        this.nomeProduto = nomeProduto;
        this.preco = preco;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public Double getPreco() {
        return preco;
    }

    public Double getDesconto() {
        return desconto;
    }

    @Override
    public String toString(){
        return "Nome Produto: " + nomeProduto + "\nPreco Produto: " + preco + "\nDesconto: " + desconto;
    }
}
