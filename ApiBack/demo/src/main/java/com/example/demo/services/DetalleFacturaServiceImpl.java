package com.example.demo.services;

import com.example.demo.entities.DetalleFactura;
import com.example.demo.entities.Ingrediente;
import com.example.demo.entities.Pedido;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DetalleFacturaServiceImpl extends BaseServiceImpl<DetalleFactura, Long> implements DetalleFacturaService {

    @Autowired
    private DetalleFacturaRepository detalleFacturaRepository;
    public DetalleFacturaServiceImpl(BaseRepository<Ingrediente, Long> baseRepository, IngredienteRepository ingredienteRepository) {
        super(baseRepository);
        this.detalleFacturaRepository = detalleFacturaRepository;
    }
    @Override
    public List<DetalleFactura> findAll() throws Exception {
        return null;
    }

    @Override
    public Page<DetalleFactura> findAll(Pageable pageable) throws Exception {
        return null;
    }

    @Override
    public DetalleFactura findById(Long aLong) throws Exception {
        return null;
    }

    @Override
    public DetalleFactura save(DetalleFactura entity) throws Exception {
        return null;
    }

    @Override
    public DetalleFactura update(Long aLong, DetalleFactura entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long aLong) throws Exception {
        return false;
    }
}
