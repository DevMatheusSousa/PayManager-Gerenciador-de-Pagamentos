package com.PayManger.pagamentos.model;

public abstract class Pessoa {
    private String nome;
    private Integer id;
    private Long cpf;
    private String email;

    public Pessoa(String nome, Long cpf, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;

        //"--- Validação de E-mail ---"
        boolean validarEmail = email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
        String emailEValido = (validarEmail) ? "Email válido" : "Email inválido";
        System.out.println(emailEValido);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", cpf=" + cpf +
                ", email='" + email + '\'' +
                '}';
    }
}
