package com.example.backendh93p1.controller;

import com.example.backendh93p1.entity.CategoriaEntity;
import com.example.backendh93p1.entity.ExamenEntity;
import com.example.backendh93p1.services.ExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/examen")
@CrossOrigin("*")
public class ExamenController {
    @Autowired
    private ExamenService examenService;

    @GetMapping("/listar")
    public ResponseEntity<?> listarExamen(){
        return ResponseEntity.ok(examenService.obtenerExamenes());
    }

    @PostMapping("/crearexamen")
    public void crearexamen (@RequestBody ExamenEntity examenEntityClient){
        examenService.agregarExamen(examenEntityClient);
    }

    @PutMapping("/actualizarexamen")
    public void actualizarExamen (@RequestBody ExamenEntity examenEntityClient){
        examenService.actualizarExamen(examenEntityClient);
    }

    @GetMapping (value = "{idexamen}")
    public ExamenEntity obtenerExamenId (@PathVariable ("idexamen") Long idexamen){
        return examenService.obtenerExamen(idexamen);
    }

    @DeleteMapping(value = "/eliminar/{examenId}")
    public ExamenEntity eliminarExamen (@PathVariable ("examenId") Long examenId){
        return examenService.eliminarExamen(examenId);
    }

    /*@GetMapping ("/examencategoria")
    public List<ExamenEntity> listarExamenesDeUnaCat (){
        return (List<ExamenEntity>) examenService.obtenerExamenesActivosDeUnaCategoria();
    }*/
}
