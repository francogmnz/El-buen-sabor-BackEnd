package com.example.demo.repository;

import com.example.demo.entities.UnidadMedida;
import com.example.demo.entities.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface UsuarioRepository extends BaseRepository<Usuario, Long> {

    List<Usuario> findByUsernameContaining(String username);

    Page<Usuario> findByUsernameContaining(String username, Pageable pageable);

    boolean existsByUsername(String username);


    //Anotación JPQL parametros indexados
    @Query(value = "SELECT u FROM Usuario u WHERE u.username = :filtro")
    List<Usuario> search(@Param("filtro")String filtro);
    @Query(value = "SELECT u FROM Usuario u WHERE u.username LIKE '%?1%'")
    Page<Usuario> search(String filtro, Pageable pageable);

    //Anotación
    @Query(
            value = "SELECT * FROM usuario WHERE usuario.username = :username",
            nativeQuery = true
    )
    List<Usuario> searchNativo(@Param("username") String filtro);
    @Query(
            value = "SELECT * FROM usuario WHERE usuario.username LIKE '%?1%'",
            countQuery = "SELECT count(*) FROM usario",
            nativeQuery = true
    )
    Page<Usuario> searchNativo(String filtro, Pageable pageable);


    Optional<Usuario> findByUsername(@Param("username") String username);
}