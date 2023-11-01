package com.example.demo.Services;

import com.example.demo.entities.Usuario;
import com.example.demo.repository.UsuarioRepository;
import com.example.demo.services.UsuarioServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class UsuarioServiceImplTest {

    @MockBean
    private UsuarioRepository usuarioRepository;
    @Autowired
    private UsuarioServiceImpl usuarioService;
    @Test
    void testSearchString() throws Exception{
        Usuario usuario = new Usuario();
        usuario.setUsername("Luciana");
        usuario.setAuth0Id("215978");

        List<Usuario> listaEnviada = new ArrayList<Usuario>();
        listaEnviada.add(usuario);

        when(usuarioRepository.searchNative("Luciana")).thenReturn(listaEnviada);

        assertEquals(listaEnviada, usuarioService.search("Luciana"));
    }
}