package com.example.demo.repository;

import com.example.demo.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductoRepository extends BaseRepository<Producto, Long> {
}
