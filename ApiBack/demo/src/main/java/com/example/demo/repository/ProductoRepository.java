package com.example.demo.repository;

import com.example.demo.entities.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository

public interface ProductoRepository extends BaseRepository<Producto, Long> {
    //query
    @Query(
            value = "SELECT * FROM Producto p WHERE p.nombre_producto LIKE %:filtro%",
            nativeQuery = true
    )
    Page<Producto> searchByNombre(
            @Param("filtro") String filtro,
            Pageable pageable
    );


    @Query(
            value = "SELECT * FROM producto WHERE producto.descripcion LIKE %:filtro%",
            nativeQuery = true)
    public List<Producto> searchNative(@Param("filtro") String filtro);
    @Query(
            value = "SELECT * FROM Producto WHERE producto.precio_venta LIKE %:precioVenta%",
            nativeQuery = true
    )
    Page<Producto> searchByPrecioVenta(
            @Param("precioVenta") BigDecimal precioVenta,
            Pageable pageable
    );

    @Query(
            value = "SELECT * FROM Producto " +
                    "WHERE producto.precio_venta BETWEEN :precioMinimo AND :precioMaximo",
            nativeQuery = true
    )
    Page<Producto> searchByPrecioVentaRange(
            @Param("precioMinimo") BigDecimal precioMinimo,
            @Param("precioMaximo") BigDecimal precioMaximo,
            Pageable pageable
    );

    @Query(value = "SELECT p FROM Producto p JOIN RubroProducto r WHERE r.nombreCategoriaProducto LIKE %:nombreCategoria%")
    Page<Producto> searchByCategoriaNombre(
            @Param("nombreCategoria") String nombreCategoria,
            Pageable pageable
    );

}
