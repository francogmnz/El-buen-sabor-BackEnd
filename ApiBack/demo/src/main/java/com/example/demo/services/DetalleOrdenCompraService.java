package com.example.demo.services;

import com.example.demo.entities.DetalleFactura;
import com.example.demo.entities.DetalleOrdenCompra;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DetalleOrdenCompraService extends BaseService<DetalleOrdenCompra, Long>{

    List<DetalleOrdenCompra> search(int filtro) throws Exception;
    Page<DetalleOrdenCompra> search(int filtro, Pageable pageable) throws Exception;

}