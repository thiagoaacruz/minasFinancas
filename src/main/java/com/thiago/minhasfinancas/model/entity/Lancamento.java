package com.thiago.minhasfinancas.model.entity;


import com.thiago.minhasfinancas.model.enums.StatusLancamento;
import com.thiago.minhasfinancas.model.enums.Tipo;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
@Table(name = "lancamento", schema = "financas")
@Builder
@Data// Notação que abrande Getters e setters, toString e hashCode
public class Lancamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Criando gerador automatico de id, como é id será como GenerationType.IDENTITY
    private Long id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "mes")
    private Integer mes;

    @Column(name = "ano")
    private  Integer ano;

    @ManyToOne //Ness caso é muitos lançamentos para um usuário
    @JoinColumn(name = "id_usuario") //JoinColumn é quando temos uma coluna de relacionamento
    private Usuario usuario;

    @Column(name = "valor")
    private BigDecimal valor;

    @Column(name = "data_cadastro")
    @Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)//
    private LocalDate dataCadastro;

    @Column(name = "tipo")
    @Enumerated(value = EnumType.STRING) //Notação para gravar o tipo de dado, nesse caso será como String
    private Tipo tipo;

    @Column(name = "status")
    @Enumerated(value = EnumType.STRING)
    private StatusLancamento status;


}
