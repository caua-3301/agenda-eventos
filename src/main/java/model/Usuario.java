package model;

import jakarta.persistence.*;

@Entity
public class Usuario {

    @Id
    @Column(length = 15)
    private String cpf;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String dataNascimento;
}
