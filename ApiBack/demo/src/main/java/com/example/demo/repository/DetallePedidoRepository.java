package com.example.demo.repository;

import com.example.demo.entities.DetallePedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetallePedidoRepository extends JpaRepository<DetallePedido, Long> {
    // Puedes agregar métodos personalizados relacionados con DetallePedido si es necesario
}
