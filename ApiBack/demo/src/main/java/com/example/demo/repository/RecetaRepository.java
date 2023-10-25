package com.example.demo.repository;

import com.example.demo.entities.Pedido;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecetaRepository extends BaseRepository<Pedido, Long> {
}
