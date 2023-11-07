package com.example.demo.services;

import com.example.demo.dtos.DTOMovimientoMonetarios;
import com.example.demo.entities.Cliente;
import com.example.demo.entities.Factura;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service

public interface FacturaService extends BaseService<Factura,Long>{

    //FALTA CONFIGURAR TODA ESTA CLASE (SU IMPL)
    List<DTOMovimientoMonetarios> getFacturasByFecha(Date fechaDesde, Date fechaHasta) throws Exception;

}