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
    Page<Pedido> searchstatus(String estado,Pageable pageable) throws Exception;
    Page<Pedido> search(Date filtro, Pageable pageable) throws Exception;
    List<Pedido> pedidoDelivery() throws Exception;

    List<Pedido> searchCajero(String filtroc) throws Exception;

    void cambioCajero(Long id,String cambio) throws Exception;
    void entregaCajero(Long id,String cambio) throws Exception;
    List<Object[]> searchDelivery() throws Exception;
    void entregaDelivery(Long id) throws Exception;

}
