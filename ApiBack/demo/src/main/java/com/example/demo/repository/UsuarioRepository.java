package com.example.demo.repository;

import com.example.demo.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface UsuarioRepository extends BaseRepository<Usuario, Long> {
    @Query(
            value = "SELECT * FROM Usuario WHERE usuario.username LIKE %:filtro%",
            nativeQuery = true)
    public List<Usuario> searchNative(@Param("filtro") String filtro);
    // Puedes agregar métodos personalizados relacionados con Usuario si es necesario
}
