package br.utpfr.td.tsi.enviaemailapi.controller;

public class Email {
    private String email;
    private String nome;

    public Email(){}

    public Email(String email, String nome) {
        this.email = email;
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
