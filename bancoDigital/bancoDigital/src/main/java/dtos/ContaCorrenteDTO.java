package dtos;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContaCorrenteDTO {

    private Double saldo;
    private ClienteDTO cliente;
    
}
