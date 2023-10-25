package com.example.demo.repository;

import com.example.demo.entities.RubroProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface RubroProductoRepository extends BaseRepository<RubroProducto, Long> {
    // Puedes agregar métodos personalizados relacionados con Categoria si es necesario
//Buscar un rubro particular.
    @Query(
            value = "SELECT * FROM rubro WHERE rubro.nombre_rubro LIKE %:filtro%",
            nativeQuery = true
    )
    List<RubroProducto> searchNativa(@Param("filtro") String filtro);
}
