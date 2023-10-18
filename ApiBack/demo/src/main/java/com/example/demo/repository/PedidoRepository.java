package com.example.demo.repository;

import com.tup.buensabor.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    // Puedes agregar métodos personalizados relacionados con Pedido si es necesario
}
