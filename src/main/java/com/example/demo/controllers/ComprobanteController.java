package com.example.demo.controllers;

import com.example.demo.entities.Comprobante;
import com.example.demo.services.ComprobanteServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/Comprobante")
public class ComprobanteController extends BaseControllerImpl<Comprobante, ComprobanteServiceImpl> {
}