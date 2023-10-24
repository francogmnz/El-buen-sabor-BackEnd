package com.example.demo.services;

import com.example.demo.entities.OrdenCompra;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.OrdenCompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class OrdenCompraServiceImpl extends BaseServiceImpl<OrdenCompra,Long> implements OrdenCompraService {

    @Autowired
    private OrdenCompraRepository ordenCompraRepository;
    public OrdenCompraServiceImpl(BaseRepository<OrdenCompra, Long> baseRepository, OrdenCompraRepository ordenCompraRepository) {
        super(baseRepository);
        this.ordenCompraRepository = ordenCompraRepository;
    }

    @Override
    public List<OrdenCompra> findAll() throws Exception {
        return null;
    }

    @Override
    public Page<OrdenCompra> findAll(Pageable pageable) throws Exception {
        return null;
    }

    @Override
    public OrdenCompra findById(Long aLong) throws Exception {
        return null;
    }

    @Override
    public OrdenCompra save(OrdenCompra entity) throws Exception {
        return null;
    }

    @Override
    public OrdenCompra update(Long aLong, OrdenCompra entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long aLong) throws Exception {
        return false;
    }
}
