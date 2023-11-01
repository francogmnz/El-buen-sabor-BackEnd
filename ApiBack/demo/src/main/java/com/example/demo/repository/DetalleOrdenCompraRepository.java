package com.example.demo.repository;

import com.example.demo.entities.DetalleFactura;
import com.example.demo.entities.DetalleOrdenCompra;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetalleOrdenCompraRepository extends BaseRepository<DetalleOrdenCompra, Long> {
    //FALTA ESTA CLASE

}