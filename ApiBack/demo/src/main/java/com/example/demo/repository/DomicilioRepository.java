package com.example.demo.repository;

import com.example.demo.entities.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DomicilioRepository extends JpaRepository<Domicilio, Long> {
    // Puedes agregar métodos personalizados relacionados con Domicilio si es necesario
}
