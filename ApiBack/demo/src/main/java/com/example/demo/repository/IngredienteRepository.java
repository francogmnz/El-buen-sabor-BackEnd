package com.example.demo.repository;

import com.example.demo.entities.Ingrediente;
import com.example.demo.entities.IngredienteReceta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface IngredienteRepository extends BaseRepository<Ingrediente, Long> {
    List<Ingrediente> findByDenominacionContaining(String denominacion);

    Page<Ingrediente> findByDenominacionContaining(String denominacion, Pageable pageable);

    //Anotación JPQL parametros indexados
    @Query(value = "SELECT i FROM Ingrediente i WHERE i.denominacion LIKE '%?1%'")
    List<Ingrediente> search(int filtro);
    @Query(value = "SELECT i FROM Ingrediente i WHERE i.denominacion LIKE '%?1%'")
    Page<Ingrediente> search(int filtro, Pageable pageable);

    //Anotación
    @Query(
            value = "SELECT * FROM ingrediente WHERE ingrediente.denominacion LIKE '%?1%'",
            nativeQuery = true
    )
    List<Ingrediente> searchNativo(String filtro);
    @Query(
            value = "SELECT * FROM ingrediente WHERE ingrediente.denominacion LIKE '%?1%'",
            countQuery = "SELECT count(*) FROM ingrediente",
            nativeQuery = true
    )
    Page<Ingrediente> searchNativo(String filtro, Pageable pageable);


}