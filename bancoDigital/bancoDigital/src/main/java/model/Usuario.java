package model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_usuario")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @Column(nullable = false, unique = true, name = "login_usuario")
    private String nomeDeUsuario;


    @Column(nullable = false, name = "senha_usuario")
    private String senha;

    @OneToOne
    @JoinColumn(name = "cpf")
    private Cliente cliente;
}
