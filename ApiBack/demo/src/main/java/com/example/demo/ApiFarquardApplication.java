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
	@Autowired
	protected FacturaRepository facturaRepository;

	public static void main(String[] args) {
		SpringApplication.run(ApiFarquardApplication.class, args);
		System.out.println("Corriendo mi proyecto Api");
	}
	@Bean
	CommandLineRunner init() {
		return args -> {

			Random random = new Random();

			for (int i = 0; i < 5; i++) {
				Factura factura = new Factura();
				factura.setFechaFacturacion(new Date());
				factura.setMpPaymentId("Forma de pago" + i); // Asegúrate de que estés proporcionando un valor válido para mpPaymentId
				// Resto de configuración de la factura
			}

		}

}
