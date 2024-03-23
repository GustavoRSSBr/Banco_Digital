package model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_conta")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public abstract class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero_conta")
    private Long numeroConta;

    @Column(name = "saldo_conta")
    private Double saldo;

}
