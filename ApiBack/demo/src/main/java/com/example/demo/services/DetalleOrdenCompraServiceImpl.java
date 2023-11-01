package com.example.demo.services;

import com.example.demo.entities.DetalleFactura;
import com.example.demo.entities.DetalleOrdenCompra;
import com.example.demo.entities.RubroIngrediente;
import com.example.demo.repository.*;
import com.example.demo.repository.DetalleOrdenCompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class DetalleOrdenCompraServiceImpl extends BaseServiceImpl<DetalleOrdenCompra, Long> implements DetalleOrdenCompraService{
    @Autowired
    private DetalleOrdenCompraRepository detalleordencompraRepository;
    public DetalleOrdenCompraServiceImpl(BaseRepository<DetalleOrdenCompra, Long> baseRepository, DetalleOrdenCompraRepository detalleordencompraRepository) {
        super(baseRepository);
        this.detalleordencompraRepository = detalleordencompraRepository;
    }


    @Override
    public List<DetalleOrdenCompra> search(int filtro) throws Exception {
        return null;
    }

    @Override
    public Page<DetalleOrdenCompra> search(int filtro, Pageable pageable) throws Exception {
        return null;
    }
}

