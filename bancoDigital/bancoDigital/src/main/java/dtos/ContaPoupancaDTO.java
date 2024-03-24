package dtos;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContaPoupancaDTO {

    private Double saldo;
    private ClienteDTO cliente;
    
}

