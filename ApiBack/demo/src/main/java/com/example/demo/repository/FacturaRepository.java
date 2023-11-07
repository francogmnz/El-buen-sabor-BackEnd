package com.example.demo.repository;

import com.example.demo.dtos.DTOMovimientoMonetarios;
import com.example.demo.entities.Factura;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository

public interface FacturaRepository extends BaseRepository<Factura, Long> {
    @Query(value = "SELECT * FROM Factura f WHERE f.fechaComprobante >= :fechaDesde AND f.fechaComprobante <= :fechaHasta", nativeQuery = true)
    List<DTOMovimientoMonetarios> getFacturasByFecha(@Param("fechaDesde") Date fechaDesde, @Param("fechaHasta") Date fechaHasta);

}