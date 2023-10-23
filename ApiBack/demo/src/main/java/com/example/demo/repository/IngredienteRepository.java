package com.example.demo.repository;

import com.example.demo.entities.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredienteRepository extends JpaRepository<Ingrediente, Long> {
    // Puedes agregar métodos personalizados relacionados con Ingrediente si es necesario
}
