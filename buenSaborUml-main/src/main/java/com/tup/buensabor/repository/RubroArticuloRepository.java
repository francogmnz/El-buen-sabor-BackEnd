package com.tup.buensabor.repository;

import com.tup.buensabor.entities.RubroIngrediente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RubroArticuloRepository extends JpaRepository<RubroIngrediente, Long> {
    // Puedes agregar métodos personalizados relacionados con RubroArticulo si es necesario
}
