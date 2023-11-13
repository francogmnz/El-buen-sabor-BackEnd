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
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    @Query(
            value = "SELECT cliente.* , usuario.id as usuario_id, usuario.username as username, usuario.password as contraseña, usuario.auth0_id as auth0_id FROM cliente JOIN usuario ON usuario.id = cliente.id_usuario WHERE cliente.email = %:filtro1% AND usuario.password = %:filtro2%" ,
            nativeQuery = true
    )
    Usuario comprobarUsuairo(@Param("filtro1")String filtro1, @Param("filtro2")String filtro2);

    List<Usuario> findByUsernameContaining(String username);

    Page<Usuario> findByUsernameContaining(String username, Pageable pageable);

    boolean existsByUsername(String username);


    //Anotación JPQL parametros indexados
    @Query(value = "SELECT u FROM Usuario u WHERE u.username LIKE '%?1%'")
    List<Usuario> search(String filtro);
    @Query(value = "SELECT u FROM Usuario u WHERE u.username LIKE '%?1%'")
    Page<Usuario> search(String filtro, Pageable pageable);

    //Anotación
    @Query(
            value = "SELECT * FROM usuario WHERE usuario.username LIKE '%?1%'",
            nativeQuery = true
    )
    List<Usuario> searchNativo(String filtro);
    @Query(
            value = "SELECT * FROM usuario WHERE usuario.username LIKE '%?1%'",
            countQuery = "SELECT count(*) FROM usario",
            nativeQuery = true
    )
    Page<Usuario> searchNativo(String filtro, Pageable pageable);


    Optional<Usuario> findByUsername(@Param("username") String username);
}