package com.example.demo.repository;

import com.example.demo.entities.Localidad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalidadRepository extends JpaRepository<Localidad, Long> {
    // Puedes agregar métodos personalizados relacionados con Localidad si es necesario
}
