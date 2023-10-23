package com.example.demo.repository;

import com.example.demo.entities.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<Factura, Long> {
    // Puedes agregar métodos personalizados relacionados con Factura si es necesario
}