package com.example.demo.services;

import com.example.demo.entities.DetalleOrdenCompra;
import com.example.demo.entities.Ingrediente;
import com.example.demo.entities.Producto;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.DetalleOrdenCompraRepository;
import com.example.demo.repository.DetalleOrdenCompraRepository;
import com.example.demo.repository.IngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleOrdenCompraServiceImpl extends BaseServiceImpl<DetalleOrdenCompra, Long> implements DetalleOrdenCompraService{
    @Autowired
    private DetalleOrdenCompraRepository detalleOrdenCompraRepository;
    public DetalleOrdenCompraServiceImpl(BaseRepository<Ingrediente, Long> baseRepository, IngredienteRepository ingredienteRepository) {
        super(baseRepository);
        this.detalleOrdenCompraRepository = detalleOrdenCompraRepository;
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

    @Override
    public List<DetalleOrdenCompra> search(String filtro) throws Exception {
        try {
            List<DetalleOrdenCompra> detalleOrdenCompras = detalleOrdenCompraRepository.searchNativo(filtro);

            return detalleOrdenCompras;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<DetalleOrdenCompra> search(String filtro, Pageable pageable) throws Exception {
        try {
            Page<DetalleOrdenCompra> detalleOrdenCompras = detalleOrdenCompraRepository.searchNativo(filtro, pageable);

            return detalleOrdenCompras;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
