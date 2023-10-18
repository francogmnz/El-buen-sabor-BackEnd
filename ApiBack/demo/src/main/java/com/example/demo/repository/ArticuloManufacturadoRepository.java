package com.example.demo.repository;

import com.tup.buensabor.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticuloManufacturadoRepository extends JpaRepository<Producto, Long> {
    // Puedes agregar métodos personalizados relacionados con ArticuloManufacturado si es necesario
}
