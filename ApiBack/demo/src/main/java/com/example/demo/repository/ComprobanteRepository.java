package com.example.demo.repository;

import com.example.demo.entities.Comprobante;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ComprobanteRepository extends BaseRepository <Comprobante, Long> {

    // Anotación método de Query
    List<Comprobante> findByNumeroContaining(int numero);
    Page<Comprobante> findByNumeroContaining(int numero, Pageable pageable);

    //Anotación JPQL parametros indexados
    @Query(value = "SELECT c FROM Comprobante c WHERE c.numero LIKE '%?1%'")
    List<Comprobante> search(int filtro);
    @Query(value = "SELECT c FROM Comprobante c WHERE c.numero LIKE '%?1%'")
    Page<Comprobante> search(int filtro, Pageable pageable);

    //Anotación
    @Query(
            value = "SELECT * FROM comprobante WHERE comprobante.numero LIKE '%?1%'",
            nativeQuery = true
    )
    List<Comprobante> searchNativo(int filtro);
    @Query(
            value = "SELECT * FROM comprobante WHERE comprobante.numero  LIKE '%?1%'",
            countQuery = "SELECT count(*) FROM comprobante",
            nativeQuery = true
    )
    Page<Comprobante> searchNativo(int filtro, Pageable pageable);

}