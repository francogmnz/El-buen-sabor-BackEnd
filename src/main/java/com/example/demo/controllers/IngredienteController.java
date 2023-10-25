package com.example.demo.controllers;

import com.example.demo.entities.Ingrediente;
import com.example.demo.services.IngredienteServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/Ingrediente")
public class IngredienteController extends BaseControllerImpl<Ingrediente, IngredienteServiceImpl> {
}