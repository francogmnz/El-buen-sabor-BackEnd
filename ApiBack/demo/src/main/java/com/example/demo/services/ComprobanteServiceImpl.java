package com.example.demo.services;

import com.example.demo.entities.Comprobante;
import com.example.demo.entities.Ingrediente;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.ComprobanteRepository;
import com.example.demo.repository.ComprobanteRepository;
import com.example.demo.repository.IngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComprobanteServiceImpl extends BaseServiceImpl<Comprobante, Long> {
    @Autowired
    private ComprobanteRepository comprobanteRepository;
    public ComprobanteServiceImpl(BaseRepository<Ingrediente, Long> baseRepository, IngredienteRepository ingredienteRepository) {
        super(baseRepository);
        this.comprobanteRepository = comprobanteRepository;
    }


    @Override
    public List<Comprobante> findAll() throws Exception {
        return null;
    }

    @Override
    public Page<Comprobante> findAll(Pageable pageable) throws Exception {
        return null;
    }

    @Override
    public Comprobante findById(Long aLong) throws Exception {
        return null;
    }

    @Override
    public Comprobante save(Comprobante entity) throws Exception {
        return null;
    }

    @Override
    public Comprobante update(Long aLong, Comprobante entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long aLong) throws Exception {
        return false;
    }
}