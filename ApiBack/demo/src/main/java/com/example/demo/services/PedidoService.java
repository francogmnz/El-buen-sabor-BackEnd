package com.example.demo.services;

import com.example.demo.entities.Cliente;
import com.example.demo.entities.Pedido;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface PedidoService extends BaseService<Pedido,Long>{
    List<Pedido> search(Date filtro) throws Exception;
    Page<Pedido> search(Date filtro, Pageable pageable) throws Exception;

}
