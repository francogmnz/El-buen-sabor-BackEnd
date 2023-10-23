package com.example.demo.controllers;

import com.example.demo.entities.DetalleOrdenCompra;
import com.example.demo.services.DetalleOrdenCompraServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/detallesordencompra")
public class DetalleOrdenCompraController extends BaseControllerImpl<DetalleOrdenCompra, DetalleOrdenCompraServiceImpl>{

}
