package model;

import enuns.Seguro;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_apolice")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Apolice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroApolice;

    @ManyToOne
    @JoinColumn(name = "idCartao")
    private Cartao cartaoAssegurado;

    private LocalDateTime dataContratacao;

    private Seguro seguroContratado;
}
