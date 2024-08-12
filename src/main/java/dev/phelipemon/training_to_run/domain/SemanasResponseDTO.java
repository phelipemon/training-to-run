package dev.phelipemon.training_to_run.domain;

import java.time.LocalDate;

public record SemanasResponseDTO(Long id, Dias dias, String treino, String objetivo, String semanaReferente, LocalDate data) {

    public SemanasResponseDTO(Semanas semanas){
        this(semanas.getId(), semanas.getDias(), semanas.getTreino(), semanas.getObjetivo(), semanas.getSemanaReferente(), semanas.getData());
    }
}
