package com.example.demo.controllers;


import com.example.demo.entities.DetallePedido;
import com.example.demo.services.DetallePedidoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/detallepedido")
public class DetallePedidoController extends  BaseControllerImpl<DetallePedido, DetallePedidoServiceImpl> {
}
