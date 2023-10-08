package com.tup.buensabor.repository;

import com.tup.buensabor.entities.Receta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecetaRepository  extends JpaRepository<Receta, Long> {
}
