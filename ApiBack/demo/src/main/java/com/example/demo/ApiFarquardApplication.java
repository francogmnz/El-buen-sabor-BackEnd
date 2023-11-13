package com.example.demo;

import com.example.demo.entities.Cliente;
import com.example.demo.entities.Usuario;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.repository.UsuarioRepository;
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
	ClienteRepository clienteRepository;
	@Autowired
	UsuarioRepository usuarioRepository;
	public static void main(String[] args) {

		SpringApplication.run(ApiFarquardApplication.class, args);
		System.out.println("Corriendo mi proyecto Api");
	}


		@Bean
		CommandLineRunner init() {
			return args -> {
				System.out.println("Funciona!");

			Usuario usuario = Usuario.builder()
					.username("ArmandoP")
					.password("123456")
					.build();


			Cliente cliente = Cliente.builder()
					.email("ArmandoP@gmail.com")
					.apellido("Paredes")
					.nombre("Armando")
					.telefono("2613612107")
					.build();

			usuarioRepository.save(usuario);
			clienteRepository.save(cliente);

		};

	}

}
