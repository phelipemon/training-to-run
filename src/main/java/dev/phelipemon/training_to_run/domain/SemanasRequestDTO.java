package dev.phelipemon.training_to_run.domain;

import java.time.LocalDate;

public record SemanasRequestDTO(Dias dias, String treino, String objetivo, String semanaReferente, LocalDate data) {
}
