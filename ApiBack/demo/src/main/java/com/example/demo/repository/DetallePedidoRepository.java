package com.example.demo.repository;

import com.example.demo.entities.Comprobante;
import com.example.demo.entities.DetallePedido;
import com.example.demo.entities.Domicilio;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface DetallePedidoRepository extends BaseRepository<DetallePedido, Long> {

    List<DetallePedido> findByCantidadContaining(int cantidad);
    Page<DetallePedido> findByCantidadContaining(int cantidad, Pageable pageable);

    boolean existsByCantidad(int cantidad);


    //Anotación JPQL parametros indexados
    @Query(value = "SELECT d FROM DetallePedido d WHERE d.cantidad LIKE '%?1%'")
    List<DetallePedido> search(String filtro);
    @Query(value = "SELECT d FROM DetallePedido d WHERE d.cantidad LIKE '%?1%'")
    Page<DetallePedido> search(String filtro, Pageable pageable);

    @Query(
            value = "SELECT * FROM detallepedido WHERE detallepedido.cantidad LIKE '%?1%'",
            nativeQuery = true
    )
    List<DetallePedido> searchNativo(String filtro);
    @Query(
            value = "SELECT * FROM detallepedido WHERE detallepedido.cantidad  LIKE '%?1%'",
            countQuery = "SELECT count(*) FROM detallepedido",
            nativeQuery = true
    )
    Page<DetallePedido> searchNativo(String filtro, Pageable pageable);

}
