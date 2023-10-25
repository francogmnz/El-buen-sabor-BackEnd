package com.example.demo.repository;

import com.example.demo.entities.OrdenCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface OrdenCompraRepository extends BaseRepository<OrdenCompra, Long> {
    // Puedes agregar métodos personalizados relacionados con OrdenCompra si es necesario
}
