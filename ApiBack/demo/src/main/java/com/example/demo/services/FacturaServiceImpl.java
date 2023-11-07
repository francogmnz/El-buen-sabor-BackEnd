package com.example.demo.services;

import com.example.demo.dtos.DTOMovimientoMonetarios;
import com.example.demo.dtos.DTORankingClientes;
import com.example.demo.entities.Domicilio;
import com.example.demo.entities.Factura;
import com.example.demo.entities.Ingrediente;
import com.example.demo.repository.*;
import com.example.demo.repository.FacturaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FacturaServiceImpl extends BaseServiceImpl<Factura, Long> implements FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    public FacturaServiceImpl(BaseRepository<Factura, Long> baseRepository, FacturaRepository facturaRepository) {
        super(baseRepository);
        this.facturaRepository = facturaRepository;
    }
    @Transactional
    @Override
    public List<DTOMovimientoMonetarios> getFacturasByFecha(Date fechaDesde, Date fechaHasta) throws Exception{
            {
                try {
                    return facturaRepository.getFacturasByFecha(fechaDesde, fechaHasta);
                } catch (Exception e) {
                    throw new Exception(e.getMessage());
                }
            }
}
}

