package model;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "tb_endereco")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, name = "logradouro_endereco")
    private String logradouro;

    @Column(nullable = false, name = "numero_endereco")
    private String numero;

    @Column(nullable = false, name = "cep_endereco")
    private Integer cep;

    @Column(nullable = false, name = "estado_endereco")
    private String estado;

    @Column(nullable = false, name = "cidade_endereco")
    private String cidade;

    @OneToOne(mappedBy = "endereco")
    private Cliente cliente;

}
