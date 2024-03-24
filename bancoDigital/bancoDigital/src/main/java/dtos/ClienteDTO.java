package dtos;

import enuns.TipoCliente;
import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {
    private String cpf;
    private String nome;
    private LocalDate dataNascimento;
    private EnderecoDTO endereco;
    private TipoCliente tipoCliente;
}
