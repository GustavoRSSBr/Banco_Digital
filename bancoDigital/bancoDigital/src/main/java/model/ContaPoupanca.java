package model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_conta_poupanca")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContaPoupanca extends Conta {

    @OneToOne(mappedBy = "contaPoupanca")
    private Cliente cliente;

    @OneToOne(mappedBy = "contaPoupanca")
    private CartaoDebito cartaoDebito;
}
