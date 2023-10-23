package com.example.demo.controllers;

import com.example.demo.entities.Receta;
import com.example.demo.services.RecetaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/Recetas")
public class RecetaController extends BaseControllerImpl<Receta, RecetaServiceImpl> {
}
