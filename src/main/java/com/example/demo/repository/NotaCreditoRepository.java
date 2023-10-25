package com.example.demo.repository;

import com.example.demo.entities.NotaCredito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface NotaCreditoRepository extends BaseRepository<NotaCredito, Long> {
    // Puedes agregar métodos personalizados relacionados con NotaDeCredito si es necesario
}
