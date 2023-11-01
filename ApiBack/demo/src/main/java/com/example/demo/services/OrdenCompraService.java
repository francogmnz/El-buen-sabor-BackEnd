package com.example.demo.services;

import com.example.demo.entities.NotaCredito;
import com.example.demo.entities.OrdenCompra;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrdenCompraService extends BaseService<OrdenCompra, Long> {

    List<OrdenCompra> search(int filtro) throws Exception;
    Page<OrdenCompra> search(int filtro, Pageable pageable) throws Exception;

}
