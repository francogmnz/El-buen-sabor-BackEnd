package com.example.demo.repository;

import com.example.demo.entities.OrdenCompra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdenCompraRepository extends JpaRepository<OrdenCompra, Long> {
    // Puedes agregar métodos personalizados relacionados con OrdenCompra si es necesario
}