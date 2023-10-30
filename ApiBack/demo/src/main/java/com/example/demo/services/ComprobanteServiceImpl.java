package com.example.demo.services;

import com.example.demo.entities.Comprobante;
import com.example.demo.repository.*;
import com.example.demo.repository.ComprobanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComprobanteServiceImpl extends BaseServiceImpl<Comprobante,Long> implements ComprobanteService{
    @Autowired
    private ComprobanteRepository comprobanteRepository;
    public ComprobanteServiceImpl(BaseRepository<Comprobante, Long> baseRepository, ComprobanteRepository comprobanteRepository) {
        super(baseRepository);
        this.comprobanteRepository = comprobanteRepository;
    }

    @Override
    public List<Comprobante> search(int filtro) throws Exception {
        try {
            List<Comprobante> comprobantes = comprobanteRepository.searchNativo(filtro);

            return comprobantes;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Comprobante> search(int filtro, Pageable pageable) throws Exception {
        try {
            Page<Comprobante> comprobante = comprobanteRepository.searchNativo(filtro, pageable);

            return comprobante;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }}