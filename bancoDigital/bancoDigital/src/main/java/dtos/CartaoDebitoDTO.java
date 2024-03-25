package dtos;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CartaoDebitoDTO {

    private String senha;
    private ClienteDTO cliente;
    
}