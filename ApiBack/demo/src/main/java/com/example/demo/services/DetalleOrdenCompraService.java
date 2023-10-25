package com.example.demo.services;

import com.example.demo.entities.DetalleOrdenCompra;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DetalleOrdenCompraService extends BaseService<DetalleOrdenCompra, Long>{
    List<DetalleOrdenCompra> search(String filtro) throws Exception;

    Page<DetalleOrdenCompra> search(String filtro, Pageable pageable) throws Exception;
}
