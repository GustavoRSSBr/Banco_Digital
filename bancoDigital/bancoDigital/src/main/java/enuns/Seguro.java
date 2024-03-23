package enuns;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Seguro {

    VIAGEM("seguro de viagens", 50.00),
    FRAUDE("seguro contra fraudes", 0.00);

    private final String descricao;
    private final double valorMensal;
}

