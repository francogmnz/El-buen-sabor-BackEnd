package com.example.demo.services;

import com.example.demo.entities.Pedido;
import com.example.demo.entities.Receta;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.PedidoRepository;
import com.example.demo.repository.RecetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class PedidoServiceImpl extends BaseServiceImpl< Pedido,Long> implements BaseService<Pedido, Long> {

    @Autowired
    private PedidoRepository pedidoRepository;
    public PedidoServiceImpl(BaseRepository<Pedido, Long> baseRepository, PedidoRepository pedidoRepository) {
        super(baseRepository);
        this.pedidoRepository = pedidoRepository;
    }
    @Override
    public List<Pedido> findAll() throws Exception {
        return null;
    }

    @Override
    public Page<Pedido> findAll(Pageable pageable) throws Exception {
        return null;
    }

    @Override
    public Pedido findById(Long aLong) throws Exception {
        return null;
    }

    @Override
    public Pedido save(Pedido entity) throws Exception {
        return null;
    }

    @Override
    public Pedido update(Long aLong, Pedido entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long aLong) throws Exception {
        return false;
    }
}
