package enuns;

import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor
@Getter
public enum TipoCliente {
    COMUM(12.00, 0.5, 1000.00),
    SUPER(8.00, 0.7, 5000.00),
    PREMIUM(0.00, 0.9, 10000.00);

    private final Double taxaManutencaoMensal;

    private final Double taxaRendimentoMensal;

    private final Double limiteCartaoCredito;
}


