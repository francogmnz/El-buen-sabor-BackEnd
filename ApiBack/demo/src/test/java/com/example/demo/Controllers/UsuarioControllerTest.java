package com.example.demo.Controllers;

import com.example.demo.controllers.UsuarioController;
import com.example.demo.entities.Usuario;
import com.example.demo.services.UsuarioServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultMatcher;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(UsuarioController.class)
public class UsuarioControllerTest {

    @MockBean
    private UsuarioServiceImpl usuarioService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testSearchString() throws Exception {
        Usuario usuario = new Usuario();
        usuario.setUsername("Luciana");

        List<Usuario> listaEnviada = new ArrayList();
        listaEnviada.add(usuario);

        when(usuarioService.search("Luciana")).thenReturn(listaEnviada);

        mockMvc.perform(get("/api/v1/Usuarios/search")
                        .param("filtro", "Luciana")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) jsonPath("$[0].username", is("Luciana")));



    }
}