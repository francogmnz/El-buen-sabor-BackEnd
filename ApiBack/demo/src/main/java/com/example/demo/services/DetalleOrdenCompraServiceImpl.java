package com.example.demo.services;

import com.example.demo.entities.DetalleOrdenCompra;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.DetalleOrdenCompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleOrdenCompraServiceImpl extends BaseServiceImpl<DetalleOrdenCompra, Long> implements DetalleOrdenCompraService{
    @Autowired
    private DetalleOrdenCompraRepository detalleOrdenCompraRepository;

    public DetalleOrdenCompraServiceImpl(BaseRepository<DetalleOrdenCompra, Long> baseRepository, DetalleOrdenCompraRepository detalleOrdenCompraRepository) {
        super(baseRepository);
    }
}
