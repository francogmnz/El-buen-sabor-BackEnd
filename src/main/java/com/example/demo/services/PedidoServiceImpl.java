package com.example.demo.services;

import com.example.demo.entities.Pedido;
import com.example.demo.entities.Receta;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.PedidoRepository;
import com.example.demo.repository.RecetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PedidoServiceImpl extends BaseServiceImpl<Pedido, Long> {
    private final PedidoRepository pedidoRepository;

    @Autowired
    public PedidoServiceImpl(PedidoRepository pedidoRepository) {
        super(pedidoRepository); // Llamada al constructor de la clase base
        this.pedidoRepository = pedidoRepository;
    }

    // Otras operaciones de servicio específicas de Pedido
}
