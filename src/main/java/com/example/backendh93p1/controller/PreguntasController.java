package com.example.backendh93p1.controller;

import com.example.backendh93p1.entity.Pregunta;
import com.example.backendh93p1.repository.PreguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/preguntas")
public class PreguntasController {
    @Autowired
    private PreguntaRepository preguntasRepository;

    @GetMapping
    public List<Pregunta> buscarpreguntas(){
        return (List<Pregunta>) preguntasRepository.findAll();
    }
}
