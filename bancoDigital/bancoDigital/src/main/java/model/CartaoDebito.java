package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;


@Entity
@Table(name = "tb_cartao_debito")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CartaoDebito extends Cartao {
    @Column (name = "limite_diario_cartao_debito")
    private Double limiteDiario;
    @OneToOne
    private ContaCorrente contaCorrente;
    @OneToOne
    private ContaPoupanca contaPoupanca;
}
