package com.example.backendh93p1.services;

import com.example.backendh93p1.entity.CategoriaEntity;
import com.example.backendh93p1.entity.ExamenEntity;

import java.util.List;
import java.util.Set;

public interface ExamenService {

    ExamenEntity agregarExamen(ExamenEntity examenEntity);

    ExamenEntity actualizarExamen(ExamenEntity examenEntity);

    Set<ExamenEntity> obtenerExamenes();

    ExamenEntity obtenerExamen(Long examenId);

    ExamenEntity eliminarExamen(Long examenId);

    List<ExamenEntity> listarExamenesDeUnaCategoria(CategoriaEntity categoriaEntity);

    List<ExamenEntity> obtenerExamenesActivos();

    List<ExamenEntity> obtenerExamenesActivosDeUnaCategoria(CategoriaEntity categoriaEntity);
}
