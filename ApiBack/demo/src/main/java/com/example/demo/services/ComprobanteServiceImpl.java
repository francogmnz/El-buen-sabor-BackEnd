package com.example.demo.services;

import com.example.demo.entities.Comprobante;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.ComprobanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComprobanteServiceImpl extends BaseServiceImpl<Comprobante, Long> implements ComprobanteService {

    @Autowired
    private ComprobanteRepository ComprobanteRepository;
    public ComprobanteServiceImpl(BaseRepository<Comprobante, Long> baseRepository, ComprobanteRepository ComprobanteRepository) {
        super(baseRepository);
        this.ComprobanteRepository = ComprobanteRepository;
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