package com.example.demo;

import com.example.demo.entities.Factura;
import com.example.demo.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.Random;

@SpringBootApplication
public class ApiFarquardApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApiFarquardApplication.class, args);
		System.out.println("Corriendo mi proyecto Api");
	}

	}
