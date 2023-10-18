package com.example.demo.repository;

import com.tup.buensabor.entities.NotaCredito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaCreditoRepository extends JpaRepository<NotaCredito, Long> {
    // Puedes agregar métodos personalizados relacionados con NotaDeCredito si es necesario
}
