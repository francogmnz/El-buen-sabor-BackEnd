package com.example.demo.services;

import com.example.demo.entities.Cliente;
import com.example.demo.entities.NotaCredito;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.repository.NotaCreditoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NotaCreditoServiceImpl extends BaseServiceImpl<NotaCredito,Long> implements NotaCreditoService{
    @Autowired
    private NotaCreditoRepository notaCreditoRepository;

    public NotaCreditoServiceImpl(BaseRepository<NotaCredito, Long> baseRepository, NotaCreditoRepository notaCreditoRepository) {
        super(baseRepository);
        this.notaCreditoRepository = notaCreditoRepository;
    }

    @Override
    public List<NotaCredito> search(String filtro) throws Exception {
        try {
            //List<UnidadMedida> unidadesmedida = unidadmedidaRepository.findByDenominacionContaining(filtro, filtro);
            //List<UnidadMedida> unidadesmedida = unidadmedidaRepository.search(filtro);
            List<NotaCredito> notaCredito = notaCreditoRepository.searchNativo(filtro);

            return notaCredito;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<NotaCredito> search(String filtro, Pageable pageable) throws Exception {
        try {
            //Page<UnidadMedida> unidadesmedida = unidadmedidaRepository.findByDenominacionContaining(filtro, filtro, pageable);
            //Page<UnidadMedida> unidadesmedida = unidadmedidaRepository.search(filtro, pageable);
            Page<NotaCredito> notaCredito = notaCreditoRepository.searchNativo(filtro, pageable);

            return notaCredito;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }}


