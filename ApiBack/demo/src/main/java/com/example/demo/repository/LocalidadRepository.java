package com.example.demo.repository;

import com.example.demo.entities.Ingrediente;
import com.example.demo.entities.Localidad;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface LocalidadRepository extends BaseRepository<Localidad, Long> {
    List<Localidad> findByNombreLocalidadContaining(String nombreLocalidad);

    Page<Localidad> findByNombreLocalidadContaining(String nombreLocalidad, Pageable pageable);

    //Anotación JPQL parametros indexados
    @Query(value = "SELECT l FROM Localidad l WHERE l.nombreLocalidad LIKE '%?1%'")
    List<Localidad> search(String filtro);
    @Query(value = "SELECT l FROM Localidad l WHERE l.nombreLocalidad LIKE '%?1%'")
    Page<Localidad> search(String filtro, Pageable pageable);

    //Anotación
    @Query(
            value = "SELECT * FROM localidad WHERE localidad.nombreLocalidad LIKE '%?1%'",
            nativeQuery = true
    )
    List<Localidad> searchNativo(String filtro);
    @Query(
            value = "SELECT * FROM localidad WHERE localidad.nombreLocalidad LIKE '%?1%'",
            countQuery = "SELECT count(*) FROM localidad",
            nativeQuery = true
    )
    Page<Localidad> searchNativo(String filtro, Pageable pageable);


}