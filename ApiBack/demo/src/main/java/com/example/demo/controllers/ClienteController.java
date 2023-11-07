package com.example.demo.controllers;

import com.example.demo.dtos.DTORankingClientes;
import com.example.demo.entities.Cliente;
import com.example.demo.services.ClienteService;
import com.example.demo.services.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/Clientes")
public class ClienteController extends BaseControllerImpl<Cliente, ClienteServiceImpl> {
    private final ClienteService clienteService;
    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }
    @GetMapping("/searchByName")
    public ResponseEntity<?> searchNativo(@RequestParam String filtro) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }

    @GetMapping("/searchPaged")
    public ResponseEntity<?> search(@RequestParam String filtro, Pageable pageable) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro, pageable));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }
    @GetMapping("/searchRankingClientes")
    public ResponseEntity<?> searchRankingClientes(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fecha1,
                                                   @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fecha2) {
        try {
            List<DTORankingClientes> rankingClientes = servicio.searchRankingClientes(fecha1, fecha2);
            return ResponseEntity.status(HttpStatus.OK).body(rankingClientes);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }
}
