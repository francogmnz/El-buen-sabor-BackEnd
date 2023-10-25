package com.example.demo.controllers;

import com.example.demo.entities.Factura;
import com.example.demo.services.FacturaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 @RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/rubroIngrediente")
public class RubroIngredienteController extends BaseControllerImpl<Factura, FacturaServiceImpl>{
}