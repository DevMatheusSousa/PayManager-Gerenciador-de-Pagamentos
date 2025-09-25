package com.PayManger.pagamentos.model;

import java.util.List;

public class Cliente extends Pessoa{
    private Integer id;
    public Cliente(Integer id, String nome, Long cpf, String email) {
        super(nome, cpf, email);
        this.id = id;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "Nome: " + getNome() +"\nCpf: " + getCpf() + "\nEmail: " + getEmail();
    }
}
