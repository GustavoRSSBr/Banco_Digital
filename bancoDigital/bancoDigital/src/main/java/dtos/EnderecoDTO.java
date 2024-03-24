package dtos;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoDTO {
    private String logradouro;
    private String numero;
    private Integer cep;
    private String estado;
    private String cidade;
}

