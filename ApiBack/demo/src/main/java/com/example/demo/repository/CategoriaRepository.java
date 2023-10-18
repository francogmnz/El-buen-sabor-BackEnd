package com.example.demo.repository;

import com.tup.buensabor.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    // Puedes agregar métodos personalizados relacionados con Categoria si es necesario
}
