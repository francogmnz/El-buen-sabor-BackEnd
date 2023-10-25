package com.example.demo.services;

import com.example.demo.entities.Factura;
import com.example.demo.entities.Ingrediente;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.FacturaRepository;
import com.example.demo.repository.FacturaRepository;
import com.example.demo.repository.IngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FacturaServiceImpl extends BaseServiceImpl<Factura, Long> implements BaseService<Factura, Long> {

    @Autowired
    private FacturaRepository facturaRepository;
    public FacturaServiceImpl(BaseRepository<Ingrediente, Long> baseRepository, IngredienteRepository ingredienteRepository) {
        super(baseRepository);
        this.facturaRepository = facturaRepository;
    }

    @Override
    public List<Factura> findAll() throws Exception {
        // Implementación para buscar todas las facturas en la base de datos
        return facturaRepository.findAll();
    }

    @Override
    public Page<Factura> findAll(Pageable pageable) throws Exception {
        // Implementación para buscar todas las facturas con paginación
        return facturaRepository.findAll(pageable);
    }

    @Override
    public Factura findById(Long aLong) throws Exception {
        // Implementación para buscar una factura por su ID
        return facturaRepository.findById(aLong).orElse(null);
    }

    @Override
    public Factura save(Factura entity) throws Exception {
        // Implementación para guardar una factura en la base de datos
        return facturaRepository.save(entity);
    }

    @Override
    public Factura update(Long aLong, Factura entity) throws Exception {
        // Implementación para actualizar una factura existente por su ID
        Factura existingFactura = facturaRepository.findById(aLong).orElse(null);
        if (existingFactura != null) {
            // Realizar las actualizaciones necesarias en existingFactura
            // Luego, guardar la factura actualizada
            return facturaRepository.save(existingFactura);
        }
        return null;
    }

    @Override
    public boolean delete(Long aLong) throws Exception {
        // Implementación para eliminar una factura por su ID
        Factura existingFactura = facturaRepository.findById(aLong).orElse(null);
        if (existingFactura != null) {
            facturaRepository.delete(existingFactura);
            return true;
        }
        return false;
    }
}

