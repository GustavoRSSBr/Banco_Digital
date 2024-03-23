package model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_conta_corrente")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class ContaCorrente extends Conta {

    @OneToOne(mappedBy = "contaCorrente")
    private Cliente cliente;

    @OneToOne(mappedBy = "contaCorrente")
    private CartaoDebito cartaoDebito;

}
