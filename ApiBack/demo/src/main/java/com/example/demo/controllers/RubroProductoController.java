package com.example.demo.controllers;

import com.example.demo.entities.RubroProducto;
import com.example.demo.services.RubroProductoService;
import com.example.demo.services.RubroProductoServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/rubro")
public class RubroProductoController extends BaseControllerImpl<RubroProducto, RubroProductoServiceImpl> {

    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam String filtro){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro));
        } catch(Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\":\"" + e.getMessage() + "\"}"));
        }
    }
}