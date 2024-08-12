package dev.phelipemon.training_to_run.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "semanas")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Semanas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Dias dias;
    private String treino;
    private String objetivo;
    private String semanaReferente;
    private LocalDate data;

    public Semanas(SemanasRequestDTO dados) {
        this.dias = dados.dias();
        this.treino = dados.treino();
        this.objetivo = dados.objetivo();
        this.semanaReferente = dados.semanaReferente();
        this.data = dados.data();
    }
}
