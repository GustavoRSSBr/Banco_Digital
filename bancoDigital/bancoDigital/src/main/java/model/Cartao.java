package model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tb_cartao")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Cartao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCartao;

    @Column (nullable = false, name = "numero_cartao")
    private String numeroCartao;

    @Column (nullable = false, name = "codigo_seguranca_cartao")
    private String codigoSeguranca;

    @Column (nullable = false, name = "senha_cartao")
    private String senha;

    @OneToMany(mappedBy = "cartaoAssegurado")
    private List<Apolice> apolices;
}
