package com.example.demo.repository;

import com.example.demo.entities.NotaCredito;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface NotaCreditoRepository extends BaseRepository<NotaCredito, Long> {
    // Anotación método de Query
    List<NotaCredito> findByDescripcionNCContaining(String descripcionNC);

    Page<NotaCredito> findByDescripcionNCContaining(String descripcionNC, Pageable pageable);

    boolean existsBydescripcionNC(String descripcionNC);


    //Anotación JPQL parametros indexados
    @Query(value = "SELECT c FROM NotaCredito c WHERE c.descripcionNC LIKE '%?1%'")
    List<NotaCredito> search(String filtro);
    @Query(value = "SELECT c FROM NotaCredito c WHERE c.descripcionNC LIKE '%?1%'")
    Page<NotaCredito> search(String filtro, Pageable pageable);

    //Anotación
    @Query(
            value = "SELECT * FROM NotaCredito WHERE NotaCredito.descripcionNC LIKE '%?1%'",
            nativeQuery = true
    )
    List<NotaCredito> searchNativo(String filtro);
    @Query(
            value = "SELECT * FROM NotaCredito WHERE NotaCredito.descripcionNC LIKE '%?1%'",
            countQuery = "SELECT count(*) FROM NotaCredito",
            nativeQuery = true
    )
    Page<NotaCredito> searchNativo(String filtro, Pageable pageable);


}
