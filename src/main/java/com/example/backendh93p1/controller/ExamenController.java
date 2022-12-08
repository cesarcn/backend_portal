package com.example.backendh93p1.controller;

import com.example.backendh93p1.entity.Examen;
import com.example.backendh93p1.repository.ExamenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/examen")
public class ExamenController {
    @Autowired
    private ExamenRepository examenRepository;

    @GetMapping
    public List<Examen> buscarExamen(){
        return (List<Examen>) examenRepository.findAll();
    }
}
