package com.example.demo.services;

import com.example.demo.entities.Ingrediente;
import com.example.demo.entities.OrdenCompra;
import com.example.demo.entities.Pedido;
import com.example.demo.entities.Receta;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.OrdenCompraRepository;
import com.example.demo.repository.PedidoRepository;
import com.example.demo.repository.RecetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class PedidoServiceImpl extends BaseServiceImpl<Pedido,Long> implements PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;
    public PedidoServiceImpl(BaseRepository<Pedido, Long> baseRepository, PedidoRepository pedidoRepository) {
        super(baseRepository);
        this.pedidoRepository = pedidoRepository;
    }


    public List<Pedido> search(Date filtro) throws Exception {
        try {
            List<Pedido> pedido = pedidoRepository.searchNativo(filtro);

            return pedido;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    public Page<Pedido> searchpending(Pageable pageable) throws Exception {
        try {
            Page<Pedido> pedido = pedidoRepository.searchpending(pageable);

            return pedido;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


    public Page<Pedido> search(Date filtro, Pageable pageable) throws Exception {
        try {
            Page<Pedido> pedido = pedidoRepository.searchNativo(filtro, pageable);

            return pedido;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
