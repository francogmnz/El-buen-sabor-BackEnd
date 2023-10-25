package com.example.demo.repository;

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

    // Anotación método de Query
    List<DetallePedido> findByCalleContaining(String calle);

    Page<DetallePedido> findByCalleContaining(String calle, Pageable pageable);

    //Anotación JPQL parametros indexados
    @Query(value = "SELECT d FROM DetallePedido d WHERE d.subtotalCosto LIKE '%?1%'")
    List<DetallePedido> search(String filtro);
    @Query(value = "SELECT d FROM DetallePedido d WHERE d.subtotalCosto LIKE '%?1%'")
    Page<DetallePedido> search(String filtro, Pageable pageable);

    //Anotación
    @Query(
            value = "SELECT * FROM DetallePedido WHERE DetallePedido.subtotalCosto LIKE '%?1%'",
            nativeQuery = true
    )
    List<DetallePedido> searchNativo(String filtro);
    @Query(
            value = "SELECT * FROM DetallePedido WHERE DetallePedido.subtotalCosto LIKE '%?1%'",
            countQuery = "SELECT count(*) FROM DetallePedido",
            nativeQuery = true
    )
    Page<DetallePedido> searchNativo(String filtro, Pageable pageable);


}
