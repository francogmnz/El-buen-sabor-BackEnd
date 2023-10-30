package com.example.demo.services;


import com.example.demo.entities.DetallePedido;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.DetallePedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetallePedidoServiceImpl extends BaseServiceImpl<DetallePedido, Long> implements DetallePedidoService {

    @Autowired
    private DetallePedidoRepository detallepedidoRepository;
    public DetallePedidoServiceImpl(BaseRepository<DetallePedido, Long> baseRepository, DetallePedidoRepository detallepedidoRepository) {
        super(baseRepository);
        this.detallepedidoRepository = detallepedidoRepository;
    }

    public List<DetallePedido> search(String filtro) throws Exception {
        try {
            List<DetallePedido> detallespedido = detallepedidoRepository.searchNativo(filtro);

            return detallespedido;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public Page<DetallePedido> search(String filtro, Pageable pageable) throws Exception {
        try {
            Page<DetallePedido> detallepedido = detallepedidoRepository.searchNativo(filtro, pageable);

            return detallepedido;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }}
