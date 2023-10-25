package com.example.demo.services;



import com.example.demo.entities.DetallePedido;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DetallePedidoService extends BaseService<DetallePedido, Long>{
    List<DetallePedido> search(String filtro) throws Exception;

    Page<DetallePedido> search(String filtro, Pageable pageable) throws Exception;
}