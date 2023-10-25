package com.example.demo.repository;

import com.example.demo.entities.Pedido;

import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends BaseRepository<Pedido, Long> {
    // Puedes agregar métodos personalizados relacionados con Pedido si es necesario
}
