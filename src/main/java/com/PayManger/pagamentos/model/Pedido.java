package com.PayManger.pagamentos.model;

import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Produto> produtos;
    private FormasDePagamento formasDePagamento;
    private StatusPagamento statusPagamento;
    private Double ValorTotal;

    public Pedido(Cliente cliente, List<Produto> produtos, FormasDePagamento formasDePagamento){
        this.cliente = cliente;
        this.produtos = produtos;
        this.formasDePagamento = formasDePagamento;
        this.statusPagamento = StatusPagamento.PENDENTE;
        this.ValorTotal = calcularValorTotal();
    }

    private Double calcularValorTotal(){
        return produtos.stream()
                .mapToDouble(p -> p.getPreco() - (p.getPreco() * p.getDesconto()))
                .sum();
    }

    public void pagamentoConcluido(){
        this.statusPagamento = StatusPagamento.CONCLUIDO;
        System.out.println("Pagamento Concluido.");
    }

    public void cancelarPagamento(){
        this.statusPagamento = StatusPagamento.CANCELADO;
        System.out.println("Pagamento cancelado.");
    }

    public StatusPagamento getStatusPagamento() {
        return statusPagamento;
    }

    public Double getValorTotal() {
        return ValorTotal;
    }
}
