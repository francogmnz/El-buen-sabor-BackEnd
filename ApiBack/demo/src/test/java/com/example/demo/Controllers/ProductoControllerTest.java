package com.example.demo.Controllers;

import com.example.demo.controllers.ProductoController;
import com.example.demo.entities.Producto;
import com.example.demo.services.ProductoServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProductoController.class)
public class ProductoControllerTest {

    @MockBean
    private ProductoServiceImpl productoService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testSearchString() throws Exception {
        Producto producto = new Producto();
        producto.setDescripcion("Menu xxl");

        List<Producto> listaEnviada = new ArrayList();
        listaEnviada.add(producto);

        when(productoService.search("Pablo")).thenReturn(listaEnviada);

        mockMvc.perform(get("/api/v1/productos/search")
                        .param("filtro", "Pablo")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].descripcion", is("Menu xxl")));




    }


}