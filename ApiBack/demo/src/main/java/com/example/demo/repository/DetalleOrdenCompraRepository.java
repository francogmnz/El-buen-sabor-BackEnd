package com.example.demo.repository;

import com.example.demo.entities.DetalleOrdenCompra;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetalleOrdenCompraRepository extends BaseRepository<DetalleOrdenCompra, Long> {
    List<DetalleOrdenCompra> findByCantidadDetalleCompraContaining(String cantidadDetalleCompra);
    Page<DetalleOrdenCompra> findByCantidadDetalleCompraContaining(String cantidadDetalleCompra, Pageable pageable);

    @Query(value = "SELECT d FROM DetalleOrdenCompra d WHERE d.cantidadDetalleCompra LIKE '%?1%'")
    List<DetalleOrdenCompra> search(String filtro);
    @Query(value = "SELECT d FROM DetalleOrdenCompra d WHERE d.cantidadDetalleCompra LIKE '%?1%'")
    Page<DetalleOrdenCompra> search(String filtro, Pageable pageable);

    @Query(
            value = "SELECT * FROM detalleordencompra WHERE detalleordencompra.cantidadDetalleCompra LIKE '%?1%'",
            nativeQuery = true
    )
    List<DetalleOrdenCompra> searchNativo(String filtro);
    @Query(
            value = "SELECT * FROM detalleordencompra WHERE detalleordencompra.cantidadDetalleCompra LIKE '%?1%'",
            countQuery = "SELECT count(*) FROM detalleordencompra",
            nativeQuery = true
    )
    Page<DetalleOrdenCompra> searchNativo(String filtro, Pageable pageable);
}
