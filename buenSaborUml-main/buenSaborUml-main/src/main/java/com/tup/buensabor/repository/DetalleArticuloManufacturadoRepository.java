package com.tup.buensabor.repository;

import com.tup.buensabor.entities.DetalleArticuloManufacturado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleArticuloManufacturadoRepository extends JpaRepository<DetalleArticuloManufacturado, Long> {
    // Puedes agregar métodos personalizados relacionados con DetalleArticuloManufacturado si es necesario
}
