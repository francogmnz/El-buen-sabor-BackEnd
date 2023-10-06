package com.tup.buensabor;

import com.tup.buensabor.entities.Cliente;
import com.tup.buensabor.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuensaborApplication {

	public static void main(String[] args) {
		SpringApplication.run(
				BuensaborApplication.class, args);
		@Autowired
		ClienteRepository clienteRepository;

		Cliente cliente1 = Cliente.builder()
				.nombre("Juan")
				.apellido("Ramirez")
				.telefono(145986)
				.email("JuanRmirez@gmail.com")
				.buid();

	}

}
