package com.example.demo.controllers;

import com.example.demo.entities.Ingrediente;
import com.example.demo.services.IngredienteServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/u.co/Ingrediente")
public class IngredienteController extends BaseControllerImpl<Ingrediente, IngredienteServiceImpl> {
    @GetMapping("/bajoStock")
    public ResponseEntity<?> bajoStock(String denominacion) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.bajoStock());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }
}