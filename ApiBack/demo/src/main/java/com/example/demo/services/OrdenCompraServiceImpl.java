package com.example.demo.services;

import com.example.demo.entities.Ingrediente;
import com.example.demo.entities.OrdenCompra;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.OrdenCompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrdenCompraServiceImpl extends BaseServiceImpl<OrdenCompra,Long> implements OrdenCompraService {

    public OrdenCompraServiceImpl(BaseRepository<Ingrediente, Long> baseRepository) {
        super(baseRepository);
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
