package com.tup.buensabor.repository;

import com.tup.buensabor.entities.ArticuloManufacturado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticuloManufacturadoRepository extends JpaRepository<ArticuloManufacturado, Long> {
    // Puedes agregar métodos personalizados relacionados con ArticuloManufacturado si es necesario
}
