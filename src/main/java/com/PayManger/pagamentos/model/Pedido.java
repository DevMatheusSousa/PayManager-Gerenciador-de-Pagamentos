package com.PayManger.pagamentos.model;

import java.util.ArrayList;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n================ PEDIDO ================\n");
        sb.append("Cliente: ").append(cliente.getNome())
                .append(" (ID: ").append(cliente.getId()).append(")\n");
        sb.append("E-mail: ").append(cliente.getEmail()).append("\n");
        sb.append("----------------------------------------\n");
        sb.append("Produtos:\n");

        for (Produto p : produtos) {
            sb.append(" - ").append(p.getNomeProduto())
                    .append(" | Preço: R$").append(p.getPreco());

            if (p.getDesconto() > 0) {
                sb.append(" | Desconto: ").append(p.getDesconto() * 100).append("%");
            }
            sb.append("\n");
        }

        sb.append("----------------------------------------\n");
        sb.append("Forma de Pagamento: ").append(formasDePagamento.pagamentoPix(String.valueOf(statusPagamento))).append("\n");
        sb.append("Valor Total: R$").append(String.format("%.2f", getValorTotal())).append("\n");
        sb.append("Status: ").append(statusPagamento).append("\n");
        sb.append("========================================\n");

        return sb.toString();
    }

}
