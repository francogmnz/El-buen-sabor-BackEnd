package com.tup.buensabor.repository;

import com.tup.buensabor.entities.RubroArticulo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RubroArticuloRepository extends JpaRepository<RubroArticulo, Long> {
    // Puedes agregar métodos personalizados relacionados con RubroArticulo si es necesario
}
