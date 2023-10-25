package com.example.demo.controllers;

import com.example.demo.entities.Pedido;
import com.example.demo.services.PedidoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/Pedidos")
public class PedidoController extends BaseControllerImpl<Pedido, PedidoServiceImpl>{
}