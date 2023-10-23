package com.example.demo.services;

import com.example.demo.entities.DetallePedido;
import com.example.demo.repository.BaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DetallePedidoServiceImpl extends BaseServiceImpl<DetallePedido,Long> implements DetallePedidoService{
    public DetallePedidoServiceImpl(BaseRepository<DetallePedido,Long> baseRepository){
        super(baseRepository);
    }
}
