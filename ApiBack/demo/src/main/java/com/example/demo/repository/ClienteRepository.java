package com.example.demo.repository;


import com.example.demo.dtos.DTORankingClientes;
import com.example.demo.entities.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface ClienteRepository extends BaseRepository<Cliente, Long> {
    // Anotación método de Query
    List<Cliente> findByApellidoContaining(String apellido);

    Page<Cliente> findByApellidoContaining(String apellido, Pageable pageable);

    boolean existsByApellido(String apellido);


    //Anotación JPQL parametros indexados
    @Query(value = "SELECT c FROM Cliente c WHERE c.apellido LIKE %:filtro%")
    List<Cliente> search(@Param("filtro") String filtro);

    @Query(value = "SELECT c FROM Cliente c WHERE c.apellido LIKE '%?1%'")
    Page<Cliente> search(String filtro, Pageable pageable);

    //Anotación
    @Query(
            value = "SELECT * FROM Cliente WHERE cliente.apellido LIKE %:filtro%",
            nativeQuery = true
    )
    List<Cliente> searchNativo(@Param("filtro") String filtro);

    @Query(
            value = "SELECT * FROM cliente WHERE cliente.apellido LIKE '%?1%'",
            countQuery = "SELECT count(*) FROM cliente",
            nativeQuery = true
    )
    Page<Cliente> searchNativo(String filtro, Pageable pageable);
    //Query de Ranking Cliente
    //Historia 27
    @Query("SELECT p.cliente FROM Pedido p WHERE p.fechaPedido BETWEEN :fechaInicio AND :fechaFin " +
            "GROUP BY p.cliente " +
            "ORDER BY COUNT(p) DESC")
    List<Cliente> findClientesConMasPedidosEnRangoFechas(
            @Param("fechaInicio") Date fechaInicio,
            @Param("fechaFin") Date fechaFin
    );

}
