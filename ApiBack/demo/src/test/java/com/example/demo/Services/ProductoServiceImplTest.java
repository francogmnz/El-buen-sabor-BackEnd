package com.example.demo.Services;
import com.example.demo.entities.Producto;
import com.example.demo.repository.ProductoRepository;
import com.example.demo.services.ProductoServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ProductoServiceImplTest {
    @MockBean
    private ProductoRepository productoRepository;

    @Autowired
    private ProductoServiceImpl productoService;

    @Test
    void testSearchInteger() throws Exception{
        Producto producto = new Producto();
        producto.setDescripcion("Menu xxl");

        List<Producto> listaEnviada = new ArrayList<Producto>();
        listaEnviada.add(producto);

        when(productoRepository.searchNative("Menu xxl")).thenReturn(listaEnviada);

        assertEquals(listaEnviada, productoService.search("Menu xxl"));
    }
}
