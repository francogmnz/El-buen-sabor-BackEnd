package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleArticuloManufacturadoRepository extends JpaRepository<DetalleProducto, Long> {
    // Puedes agregar métodos personalizados relacionados con DetalleArticuloManufacturado si es necesario
}
