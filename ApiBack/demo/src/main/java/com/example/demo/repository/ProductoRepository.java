package com.example.demo.repository;

import com.example.demo.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Puedes agregar métodos personalizados relacionados con DetalleArticuloManufacturado si es necesario
}
