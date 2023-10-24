package com.example.demo.repository;

import com.example.demo.entities.RubroProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RubroProductoRepository extends JpaRepository<RubroProducto, Long> {
    // Puedes agregar métodos personalizados relacionados con Categoria si es necesario
}
