package dtos;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {

    private String nomeDeUsuario;
    private String senha;
    private ClienteDTO cliente;
}