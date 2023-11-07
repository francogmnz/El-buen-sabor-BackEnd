package com.example.demo.controllers;

import com.example.demo.dtos.DTOMovimientoMonetarios;
import com.example.demo.dtos.DTORankingClientes;
import com.example.demo.entities.Factura;
import com.example.demo.services.FacturaServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/Factura")
public class FacturaController extends BaseControllerImpl<Factura, FacturaServiceImpl>{
    @GetMapping("/getFacturasByFecha")
    public ResponseEntity<?> getFacturasByFecha(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fechaDesde,
                                                   @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fechaHasta) {
        try {
            List<DTOMovimientoMonetarios> movimientoMonetarios = servicio.getFacturasByFecha(fechaDesde, fechaHasta);
            return ResponseEntity.status(HttpStatus.OK).body(movimientoMonetarios);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }
}