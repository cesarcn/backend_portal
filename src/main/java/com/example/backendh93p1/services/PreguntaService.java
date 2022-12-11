package com.example.backendh93p1.services;

import com.example.backendh93p1.entity.ExamenEntity;
import com.example.backendh93p1.entity.PreguntaEntity;

import java.util.List;
import java.util.Set;

public interface PreguntaService {

    PreguntaEntity agregarPregunta(PreguntaEntity preguntaEntity);

    PreguntaEntity actualizarPregunta(PreguntaEntity preguntaEntity);

    Set<PreguntaEntity> obtenerPreguntas();

    PreguntaEntity obtenerPregunta(Long preguntaId);

    List<PreguntaEntity> obtenerPreguntasDelExamen(ExamenEntity examenEntity);

    ExamenEntity eliminarPregunta(Long preguntaId);

    PreguntaEntity listarPregunta(Long preguntaId);
}
