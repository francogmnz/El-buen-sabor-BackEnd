package com.example.demo.repository;

import com.example.demo.entities.DetalleOrdenCompra;
import com.example.demo.entities.Factura;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface FacturaRepository extends BaseRepository<Factura, Long> {
    
}
