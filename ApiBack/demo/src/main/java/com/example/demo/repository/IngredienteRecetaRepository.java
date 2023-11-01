package com.example.demo.repository;
import com.example.demo.entities.Domicilio;
import com.example.demo.entities.Factura;
import com.example.demo.entities.IngredienteReceta;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IngredienteRecetaRepository extends BaseRepository<IngredienteReceta, Long>{

    List<IngredienteReceta> findByCantidadIRContaining(int cantidadIR);

    Page<IngredienteReceta> findByCantidadIRContaining(int cantidadIR, Pageable pageable);

    //Anotación JPQL parametros indexados
    @Query(value = "SELECT i FROM IngredienteReceta i WHERE i.cantidadIR LIKE '%?1%'")
    List<IngredienteReceta> search(String filtro);
    @Query(value = "SELECT i FROM IngredienteReceta i WHERE i.cantidadIR LIKE '%?1%'")
    Page<IngredienteReceta> search(String filtro, Pageable pageable);

    //Anotación
    @Query(
            value = "SELECT * FROM ingredientereceta WHERE ingredientereceta.cantidadIR LIKE '%?1%'",
            nativeQuery = true
    )
    List<IngredienteReceta> searchNativo(int filtro);
    @Query(
            value = "SELECT * FROM ingredientereceta WHERE ingredientereceta.cantidadIR LIKE '%?1%'",
            countQuery = "SELECT count(*) FROM ingredientereceta",
            nativeQuery = true
    )
    Page<IngredienteReceta> searchNativo(int filtro, Pageable pageable);


}