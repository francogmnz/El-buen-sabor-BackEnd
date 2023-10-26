package com.example.demo.Repositories;

import com.example.demo.entities.Producto;
import com.example.demo.repository.ProductoRepository;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class ProductoRepositoryTest {
    @Autowired
    private EntityManager entityManager;

    @Autowired
    private ProductoRepository productoRepository;

    @Test
    void testSearchString() {
        Producto producto = new Producto();
        producto.setDescripcion("Menu xxl");

        List<Producto> listaEnviada = new ArrayList();
        listaEnviada.add(producto);

        entityManager.persist(producto);
        entityManager.flush();

        assertEquals(listaEnviada, productoRepository.searchNative("Pablo"));

    }
}