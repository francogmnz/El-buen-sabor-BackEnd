package com.example.demo.repository;

import com.example.demo.entities.Pedido;

import com.example.demo.entities.Producto;
import com.example.demo.entities.Receta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface RecetaRepository extends BaseRepository<Receta, Long> {
    List<Pedido> findByNumRecetaContaining(int numReceta);

    Page<Pedido> findByNumRecetaContaining(int numReceta, Pageable pageable);

    boolean existsByNombreReceta(String nombreReceta);

    //Anotación
    @Query(
            value = "SELECT * FROM Receta WHERE Receta.num_receta = :filtro ",
            nativeQuery = true
    )
    List<Receta> searchNativo(@Param("filtro") int filtro);
    @Query(
            value = "SELECT * FROM Receta WHERE Receta.num_receta = :filtro ",
            nativeQuery = true
    )
    List<Receta> searchOne(@Param("filtro") int filtro);
    @Query(
            value = "SELECT * FROM Receta WHERE Receta.num_receta LIKE '%?1%'",
            countQuery = "SELECT count(*) FROM Receta",
            nativeQuery = true
    )
    Page<Receta> searchNativo(int filtro, Pageable pageable);

}