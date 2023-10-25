package com.example.demo.repository;

import com.example.demo.entities.DetalleOrdenCompra;
import com.example.demo.entities.RubroProducto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface RubroProductoRepository extends BaseRepository<RubroProducto, Long> {
    List<RubroProducto> findByNombreCategoriaContaining(String nombreCategoria);
    Page<RubroProducto> findByNombreCategoriaContaining(String nombreCategoria, Pageable pageable);

    @Query(value = "SELECT r FROM RubroProducto r WHERE r.nombreCategoria LIKE '%?1%'")
    List<RubroProducto> search(String filtro);
    @Query(value = "SELECT r FROM RubroProducto r WHERE r.nombreCategoria LIKE '%?1%'")
    Page<RubroProducto> search(String filtro, Pageable pageable);

    @Query(
            value = "SELECT * FROM rubroproducto WHERE rubroproducto.nombreCategoria LIKE '%?1%'",
            nativeQuery = true
    )
    List<RubroProducto> searchNativo(String filtro);
    @Query(
            value = "SELECT * FROM rubroproducto WHERE rubroproducto.nombreCategoria LIKE '%?1%'",
            countQuery = "SELECT count(*) FROM rubroproducto",
            nativeQuery = true
    )
    Page<RubroProducto> searchNativo(String filtro, Pageable pageable);
}
