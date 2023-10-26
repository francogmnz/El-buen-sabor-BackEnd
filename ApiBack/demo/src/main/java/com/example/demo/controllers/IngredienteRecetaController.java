package com.example.demo.controllers;

import com.example.demo.entities.IngredienteReceta;
import com.example.demo.services.IngredienteRecetaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/IngredienteReceta")
public class IngredienteRecetaController extends BaseControllerImpl<IngredienteReceta, IngredienteRecetaServiceImpl> {

}
