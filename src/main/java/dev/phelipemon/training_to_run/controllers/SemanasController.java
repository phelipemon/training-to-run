package dev.phelipemon.training_to_run.controllers;

import dev.phelipemon.training_to_run.domain.Semanas;
import dev.phelipemon.training_to_run.domain.SemanasRequestDTO;
import dev.phelipemon.training_to_run.domain.SemanasResponseDTO;
import dev.phelipemon.training_to_run.repository.SemanasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/semana")
public class SemanasController {

    @Autowired
    private SemanasRepository repository;

    @GetMapping
    public List<SemanasResponseDTO> listar(){

        List<SemanasResponseDTO> listaSemanas = repository.findAll().stream()
                .map(SemanasResponseDTO::new)
                .collect(Collectors.toList());
        return listaSemanas;
    }

    @PostMapping
    public void salvar(@RequestBody SemanasRequestDTO dados){
        Semanas semanas = new Semanas(dados);
        repository.save(semanas);
    }
}
