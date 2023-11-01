package com.example.demo.services;

import com.example.demo.entities.Cliente;
import com.example.demo.entities.Ingrediente;
import com.example.demo.entities.Localidad;
import com.example.demo.entities.NotaCredito;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.repository.LocalidadRepository;
import com.example.demo.repository.NotaCreditoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NotaCreditoServiceImpl extends BaseServiceImpl<NotaCredito,Long> implements NotaCreditoService{
    @Autowired
    private NotaCreditoRepository notacreditoRepository;
    public NotaCreditoServiceImpl(BaseRepository<NotaCredito, Long> baseRepository, NotaCreditoRepository notacreditoRepository) {
        super(baseRepository);
        this.notacreditoRepository = notacreditoRepository;
    }

    @Override
    public List<NotaCredito> search(String filtro) throws Exception {
        try {
            List<NotaCredito> notaCredito = notacreditoRepository.searchNativo(filtro);

            return notaCredito;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<NotaCredito> search(String filtro, Pageable pageable) throws Exception {
        try {
            Page<NotaCredito> notaCredito = notacreditoRepository.searchNativo(filtro, pageable);

            return notaCredito;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }}


