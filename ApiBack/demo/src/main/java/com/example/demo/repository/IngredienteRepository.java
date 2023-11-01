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

    @Query( value = "SELECT * FROM ingrediente WHERE (stock_actual <= stock_minimo) OR (stock_actual <= (stock_minimo + 0.2 * stock_minimo)) ",
            nativeQuery = true)
    List<Ingrediente> bajoStock();


}