package com.example.demo.repository;

import com.example.demo.entities.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IngredienteRepository extends BaseRepository<Ingrediente, Long> {
    // Puedes agregar métodos personalizados relacionados con Ingrediente si es necesario
}
