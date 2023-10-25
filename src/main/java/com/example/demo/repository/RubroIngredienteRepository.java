package com.example.demo.repository;

import com.example.demo.entities.RubroIngrediente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RubroIngredienteRepository extends BaseRepository<RubroIngrediente, Long> {
    // Puedes agregar métodos personalizados relacionados con RubroArticulo si es necesario
}
