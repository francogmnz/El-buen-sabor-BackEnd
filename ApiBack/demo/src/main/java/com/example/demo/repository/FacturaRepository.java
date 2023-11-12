package com.example.demo.repository;

import com.example.demo.entities.Domicilio;
import com.example.demo.entities.Factura;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository

public interface FacturaRepository extends BaseRepository<Factura, Long> {
    //Consulta para la historia de usuario 18 "Generacion de Factura"
    @Query(SELECT f, p, c, o
            FROM Factura f
            JOIN f.comprobante o
            JOIN c.pedido p
            JOIN p.cliente c
            WHERE p.estado = 'PAGADO',
    )
    List<Factura> emitirFactura
}