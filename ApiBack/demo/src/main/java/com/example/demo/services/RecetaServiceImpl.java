package com.example.demo.services;

import com.example.demo.entities.Ingrediente;
import com.example.demo.entities.NotaCredito;
import com.example.demo.entities.OrdenCompra;
import com.example.demo.entities.Receta;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.NotaCreditoRepository;
import com.example.demo.repository.RecetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RecetaServiceImpl extends BaseServiceImpl<Receta,Long> implements RecetaService {
    @Autowired
    private RecetaRepository recetaRepository;
    public RecetaServiceImpl(BaseRepository<Receta, Long> baseRepository, RecetaRepository recetaRepository) {
        super(baseRepository);
        this.recetaRepository = recetaRepository;
    }


    @Override
    public List<Receta> search(int filtro) throws Exception {
        return null;
    }

    public Page<Receta> search(int filtro, Pageable pageable) throws Exception {
        try {
            Page<Receta> receta = recetaRepository.searchNativo(filtro, pageable);

            return receta;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }}

