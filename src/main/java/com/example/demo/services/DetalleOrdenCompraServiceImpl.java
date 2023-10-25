package com.example.demo.services;

import com.example.demo.entities.DetalleOrdenCompra;
import com.example.demo.entities.Producto;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.DetalleOrdenCompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleOrdenCompraServiceImpl extends BaseServiceImpl<DetalleOrdenCompra, Long> implements DetalleOrdenCompraService{
    @Autowired
    private DetalleOrdenCompraRepository detalleOrdenCompraRepository;

    public DetalleOrdenCompraServiceImpl(BaseRepository<DetalleOrdenCompra, Long> baseRepository, DetalleOrdenCompraRepository detalleOrdenCompraRepository) {
        super(baseRepository);
    }

    @Override
    public List<DetalleOrdenCompra> findAll() throws Exception {
        return null;
    }

    @Override
    public Page<DetalleOrdenCompra> findAll(Pageable pageable) throws Exception {
        return null;
    }

    @Override
    public DetalleOrdenCompra findById(Long aLong) throws Exception {
        return null;
    }

    @Override
    public DetalleOrdenCompra save(DetalleOrdenCompra entity) throws Exception {
        return null;
    }

    @Override
    public DetalleOrdenCompra update(Long aLong, DetalleOrdenCompra entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long aLong) throws Exception {
        return false;
    }
}
