package com.example.demo.repository;

import com.tup.buensabor.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // Puedes agregar métodos personalizados relacionados con Cliente si es necesario
}