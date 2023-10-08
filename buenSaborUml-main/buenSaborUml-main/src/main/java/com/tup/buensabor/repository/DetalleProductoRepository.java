package com.tup.buensabor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleProductoRepository extends JpaRepository<com.tup.buensabor.entities.DetalleProducto, Long> {
    // Puedes agregar métodos personalizados relacionados con DetalleArticuloManufacturado si es necesario
}
