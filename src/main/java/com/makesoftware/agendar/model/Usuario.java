package com.makesoftware.agendar.model;

import jakarta.persistence.*;

@Entity
public class Usuario {

    @Id //chave primária
    @Column(length = 15)
    private String cpf;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String dataNascimento;

    public Usuario() {}

    public Usuario(String cpf, String nome, String email, String dataNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }
}
