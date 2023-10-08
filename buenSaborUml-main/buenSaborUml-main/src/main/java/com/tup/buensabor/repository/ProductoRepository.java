package com.tup.buensabor.repository;

import com.tup.buensabor.entities.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Ingrediente, Long> {
    // Puedes agregar métodos personalizados relacionados con ArticuloManufacturado si es necesario
}
