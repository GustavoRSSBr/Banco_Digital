package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Column;
import lombok.*;

@Entity
@Table(name = "tb_cartao_credito")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class CartaoCredito extends Cartao {
    @Column(nullable = false, name = "limite_cartao_credito")
    private Double limiteCredito;

    @OneToOne
    private Cliente cliente;
}

