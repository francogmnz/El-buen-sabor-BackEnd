package com.example.demo.repository;

import com.example.demo.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UsuarioRepository extends BaseRepository<Usuario, Long> {
    // Puedes agregar métodos personalizados relacionados con Usuario si es necesario
}
