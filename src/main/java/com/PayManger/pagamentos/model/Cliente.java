package com.PayManger.pagamentos.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{
    private Integer id;

    private Long saldo = 1500L;
    List<Pedido> pedidos = new ArrayList<>();

    public Cliente(Integer id, String nome, Long cpf, String email) {
        super(nome, cpf, email);
        this.id = id;
    }
    public Cliente(Integer id, String nome, Long cpf, String email, Long saldo) {
        super(nome, cpf, email);
        this.saldo = saldo;
        this.id = id;
    }

    public void adicionarPedido(Pedido pedido){
        pedidos.add(pedido);

    }


    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString(){
        return "Nome: " + getNome() +"\nCpf: " + getCpf() + "\nEmail: " + getEmail();
    }
}
