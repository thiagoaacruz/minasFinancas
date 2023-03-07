package com.thiago.minhasfinancas.model.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import java.util.Objects;


@Entity
@Table( name="usuario", schema = "financas") //@Table = Essa notação serve para dizer que essa entidade é uma tabela
@Builder
@Data// Notação que abrande Getters e setters, toString e hashCode
public class Usuario {

    @Id //Essa notação informa que o id é a chave primaria
    @Column(name = "id")    //criando a coluna da tabela id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Criando gerador automatico de id, como é id será como GenerationType.IDENTITY
    private Long id;

    @Column(name = "nome")
    private  String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private  String senha;


    //Construtor padrão
    public Usuario() {

    }
}
