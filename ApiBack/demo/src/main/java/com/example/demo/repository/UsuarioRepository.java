package com.example.demo.repository;

import com.example.demo.entities.UnidadMedida;
import com.example.demo.entities.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface UsuarioRepository extends BaseRepository<Usuario, Long> {
    List<Usuario> findByUsernameContaining(String username);
    Page<Usuario> findByUsernameContaining(String username, Pageable pageable);

    boolean existsByAuth0Id(String auth0Id);

    @Query(value = "SELECT u FROM Usuario u WHERE u.username LIKE '%?1%'")
    List<Usuario> search(String filtro);
    @Query(value = "SELECT u FROM Usuario u WHERE u.username LIKE '%?1%'")
    Page<Usuario> search(String filtro, Pageable pageable);
}
