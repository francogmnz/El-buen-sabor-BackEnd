package com.example.demo.repository;

import com.example.demo.entities.OrdenCompra;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface OrdenCompraRepository extends BaseRepository<OrdenCompra, Long> {
    // Anotación método de Query
    List<OrdenCompra> findBynumOrdenCompraContaining(int numOrdenCompra);

    Page<OrdenCompra> findBynumOrdenCompraContaining(int numOrdenCompra, Pageable pageable);

    boolean existsBynumOrdenCompra(int numOrdenCompra);


    //Anotación JPQL parametros indexados
    //@Query(value = "SELECT c FROM OrdenCompra c WHERE c.numOrdenCompra LIKE '%?1%'")
   // List<OrdenCompra> search(String filtro);
    //@Query(value = "SELECT c FROM OrdenCompra c WHERE c.numOrdenCompra LIKE '%?1%'")
    //Page<OrdenCompra> search(String filtro, Pageable pageable);

    //Anotación
    @Query(
            value = "SELECT * FROM OrdenCompra WHERE OrdenCompra.numOrdenCompra LIKE '%?1%'",
            nativeQuery = true
    )
    List<OrdenCompra> searchNativo(int filtro);
    @Query(
            value = "SELECT * FROM OrdenCompra WHERE OrdenCompra.numOrdenCompra LIKE '%?1%'",
            countQuery = "SELECT count(*) FROM OrdenCompra",
            nativeQuery = true
    )
    Page<OrdenCompra> searchNativo(int filtro, Pageable pageable);

}
