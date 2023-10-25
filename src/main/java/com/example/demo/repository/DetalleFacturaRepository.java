package com.example.demo.repository;

import com.example.demo.entities.DetalleFactura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleFacturaRepository extends BaseRepository<DetalleFactura, Long> {
    // Puedes agregar métodos personalizados relacionados con DetalleFactura si es necesario
}
