package com.example.backendh93p1.controller;

import com.example.backendh93p1.entity.ExamenEntity;
import com.example.backendh93p1.entity.PreguntaEntity;
import com.example.backendh93p1.repository.PreguntaRepository;
import com.example.backendh93p1.services.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/preguntas")
@CrossOrigin("*")
public class PreguntasController {
    @Autowired
    private PreguntaService preguntaService;
    
}
