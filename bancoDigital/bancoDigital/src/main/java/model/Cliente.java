package model;

import enuns.TipoCliente;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_cliente")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Cliente {

    @Id
    @Column(nullable = false, unique = true, name = "cpf_cliente")
    private String cpf;

    @Column (nullable = false, name = "nome_cliente")
    private String nome;

    @Column (nullable = false, name = "data_nascimento_cliente")
    private LocalDate dataNascimento;

    @OneToOne
    private Endereco endereco;

    @Column(nullable = false, name = "tipo_cliente")
    @Enumerated(EnumType.STRING)
    private TipoCliente tipoCliente;

    @OneToOne
    private ContaCorrente contaCorrente;

    @OneToOne
    private ContaPoupanca contaPoupanca;

}

