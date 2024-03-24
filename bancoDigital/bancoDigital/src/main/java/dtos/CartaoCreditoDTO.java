package dtos;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CartaoCreditoDTO {
    private String senha;
    private ClienteDTO cliente;
}

