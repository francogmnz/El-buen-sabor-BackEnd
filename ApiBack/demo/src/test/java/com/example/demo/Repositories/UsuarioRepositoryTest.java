package com.example.demo.Repositories;
import com.example.demo.entities.Usuario;
import com.example.demo.repository.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import jakarta.persistence.EntityManager;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class UsuarioRepositoryTest {

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Test
    void testSearchString() {
        Usuario usuario = new Usuario();
        usuario.setUsername("Luciana");

        List<Usuario> listaEnviada = new ArrayList();
        listaEnviada.add(usuario);

        entityManager.persist(usuario);
        entityManager.flush();

        assertEquals(listaEnviada, usuarioRepository.searchNative("Luciana"));

    }
}
