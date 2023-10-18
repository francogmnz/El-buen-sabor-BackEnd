package com.example.demo.repository;

import com.tup.buensabor.entities.UnidadMedida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnidadMedidaRepository extends JpaRepository<UnidadMedida, Long> {
    // Puedes agregar métodos personalizados relacionados con UnidadMedida si es necesario
}
