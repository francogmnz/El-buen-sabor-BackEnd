package com.example.demo.repository;

import com.example.demo.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ClienteRepository extends BaseRepository<Cliente, Long> {
    // Puedes agregar métodos personalizados relacionados con Cliente si es necesario
}
