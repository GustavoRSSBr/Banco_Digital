package dtos;

import enuns.Seguro;
import lombok.*;
    @Getter
    @Setter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public class ApoliceDTO {
        private Long idCartaoAssegurado;
        private Seguro seguroContratado;
    }



