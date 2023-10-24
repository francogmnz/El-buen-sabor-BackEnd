package com.example.demo.services;

import com.example.demo.entities.Localidad;
import com.example.demo.entities.Producto;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class ProductoServiceImpl extends BaseServiceImpl<Producto, Long> implements ProductoService{
    @Autowired
    private ProductoRepository productoRepository;

    public ProductoServiceImpl(BaseRepository<Producto, Long> baseRepository, ProductoRepository productoRepository) {
        super(baseRepository);
    }

    @Override
    public List<Producto> findAll() throws Exception {
        return null;
    }

    @Override
    public Page<Producto> findAll(Pageable pageable) throws Exception {
        return null;
    }

    @Override
    public Producto findById(Long aLong) throws Exception {
        return null;
    }

    @Override
    public Producto save(Producto entity) throws Exception {
        return null;
    }

    @Override
    public Producto update(Long aLong, Producto entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long aLong) throws Exception {
        return false;
    }
}
