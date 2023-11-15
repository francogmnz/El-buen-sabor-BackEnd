package com.example.demo.controllers;

import com.example.demo.entities.Pedido;
import com.example.demo.services.PedidoServiceImpl;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.Date;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/e/Pedido")
public class PedidoController extends BaseControllerImpl<Pedido, PedidoServiceImpl>{
    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam Date filtro) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }

    @GetMapping("/search/status/pending")
    public ResponseEntity<?> searchpending(@PageableDefault(page = 0, size = 10)Pageable pageable) {
        try {
            String estado = "PREPARACION";
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchstatus(estado,pageable));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }
    @GetMapping("/search/status/completed")
    public ResponseEntity<?> searchcompleted(@PageableDefault(page = 0, size = 10)Pageable pageable) {
        try {
            String estado = "COMPLETADO";
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchstatus(estado,pageable));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }
    @GetMapping("/search/status/canceled")
    public ResponseEntity<?> searchcanceled(@PageableDefault(page = 0, size = 10)Pageable pageable) {
        try {
            String estado = "CANCELADO";
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchstatus(estado,pageable));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }
    @GetMapping("/search/status/ontheway")
    public ResponseEntity<?> searchontheway(@PageableDefault(page = 0, size = 10)Pageable pageable) {
        try {
            String estado = "EN_CAMINO";
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchstatus(estado,pageable));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }

    @GetMapping("/searchPaged")
    public ResponseEntity<?> search(@RequestParam Date filtro, Pageable pageable) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro, pageable));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }

    @GetMapping("/pedidoDelivery")
    public ResponseEntity<?> pedidoDelivery() {
        try {
            System.out.println("PedidoDelivery Andando");
            return ResponseEntity.status(HttpStatus.OK).body(servicio.pedidoDelivery());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }

    @GetMapping("/searchCajero")
    public ResponseEntity<?> searchCajero(@RequestParam String filtroc){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchCajero(filtroc));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }
    @PutMapping("/cambioCajero/{id}")
    public ResponseEntity<?> cambioCajero(@PathVariable Long id, @RequestParam String cambio) {
        try {
            // Llama al servicio para realizar la operación de actualización
            servicio.cambioCajero(id, cambio);
            return ResponseEntity.status(HttpStatus.OK).body("Operación exitosa");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

   @PutMapping("/entregaCajero/{id}")
    public ResponseEntity<?> entregaCajero(@PathVariable Long id,@RequestParam String cambio){
        try {
            servicio.entregaCajero(id, cambio);
            return ResponseEntity.status(HttpStatus.OK).body("Operación exitosa");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }    @GetMapping("/searchDelivery")
    public ResponseEntity<?> searchDelivery(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchDelivery());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }    @PutMapping("/entregaDelivery/{id}")
    public ResponseEntity<?> entregaDelivery(@PathVariable Long id){
        try {
            servicio.entregaDelivery(id);
            return ResponseEntity.status(HttpStatus.OK).body("Operación exitosa");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }

}