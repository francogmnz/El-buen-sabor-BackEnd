package com.example.demo.repository;

import com.example.demo.entities.DetalleFactura;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface DetalleFacturaRepository extends BaseRepository<DetalleFactura, Long> {

    List<DetalleFactura> findByCantidadContaining(int cantidad);
    Page<DetalleFactura> findByCantidadContaining(int cantidad, Pageable pageable);

    boolean existsBySubtotal(int subtotal);

    @Query(value = "SELECT d FROM DetalleFactura d WHERE d.cantidad LIKE '%?1%'")
    List<DetalleFactura> search(int filtro);
    @Query(value = "SELECT d FROM DetalleFactura d WHERE d.cantidad LIKE '%?1%'")
    Page<DetalleFactura> search(int filtro, Pageable pageable);

    @Query(
            value = "SELECT * FROM detallefactura WHERE detallefactura.subtotal LIKE '%?1%'",
            nativeQuery = true
    )
    List<DetalleFactura> searchNativo(int filtro);
    @Query(
            value = "SELECT * FROM detallefactura WHERE detallefactura.subtotal LIKE '%?1%'",
            countQuery = "SELECT count(*) FROM detallefactura",
            nativeQuery = true
    )
    Page<DetalleFactura> searchNativo(int filtro, Pageable pageable);

}