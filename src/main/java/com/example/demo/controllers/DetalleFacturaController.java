package com.example.demo.controllers;

import com.example.demo.entities.DetalleFactura;
import com.example.demo.services.DetalleFacturaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/DetalleFactura")
public class DetalleFacturaController extends BaseControllerImpl<DetalleFactura, DetalleFacturaServiceImpl> {
}
