package com.example.demo.repository;

import com.example.demo.entities.Pedido;

import com.example.demo.entities.Receta;
import org.springframework.stereotype.Repository;

@Repository
public interface RecetaRepository extends BaseRepository<Receta, Long> {
}
