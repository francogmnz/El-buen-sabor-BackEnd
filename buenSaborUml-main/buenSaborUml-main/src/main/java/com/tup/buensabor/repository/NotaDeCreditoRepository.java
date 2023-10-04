package com.tup.buensabor.repository;

import com.tup.buensabor.entities.NotaDeCredito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaDeCreditoRepository extends JpaRepository<NotaDeCredito, Long> {
    // Puedes agregar métodos personalizados relacionados con NotaDeCredito si es necesario
}
