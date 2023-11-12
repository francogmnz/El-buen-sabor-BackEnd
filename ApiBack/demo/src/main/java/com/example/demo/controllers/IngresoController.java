package com.example.demo.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class IngresoController {

    @PostMapping(value = "u")
    public String welcomeUser(){
        return "Inicio de sesion usuario";
    }
    @PostMapping(value = "a")
    public String welcomeAdmin(){
        return "Inicio de sesion admin";
    }
    @PostMapping(value = "e")
    public String welcomeEmployee(){
        return "Inicio de sesion empleado";
    }

}
