package com.example.demo.services;

import com.example.demo.entities.DetalleFactura;
import com.example.demo.repository.*;
import com.example.demo.repository.DetalleFacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DetalleFacturaServiceImpl extends BaseServiceImpl<DetalleFactura,Long> implements DetalleFacturaService {
    @Autowired
    private DetalleFacturaRepository detallefacturaRepository;
    public DetalleFacturaServiceImpl(BaseRepository<DetalleFactura, Long> baseRepository, DetalleFacturaRepository detallefacturaRepository) {
        super(baseRepository);
        this.detallefacturaRepository = detallefacturaRepository;
    }
    @Override
    public List<DetalleFactura> search(int filtro) throws Exception {
        try {
            List<DetalleFactura> detallesfactura = detallefacturaRepository.searchNativo(filtro);

            return detallesfactura;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<DetalleFactura> search(int filtro, Pageable pageable) throws Exception {
        try {
            Page<DetalleFactura> detallefactura = detallefacturaRepository.searchNativo(filtro, pageable);

            return detallefactura;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }}