package com.example.demo.repository;

import com.example.demo.entities.RubroIngrediente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RubroIngredienteRepository extends JpaRepository<RubroIngrediente, Long> {
    // Puedes agregar métodos personalizados relacionados con RubroArticulo si es necesario
}
