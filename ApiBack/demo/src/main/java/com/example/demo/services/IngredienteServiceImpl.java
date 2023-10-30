package com.example.demo.services;

import com.example.demo.entities.Ingrediente;
import com.example.demo.entities.IngredienteReceta;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.IngredienteRecetaRepository;
import com.example.demo.repository.IngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IngredienteServiceImpl extends BaseServiceImpl<Ingrediente, Long> implements IngredienteService {

    @Autowired
    private IngredienteRepository ingredienteRepository;
    public IngredienteServiceImpl(BaseRepository<Ingrediente, Long> baseRepository, IngredienteRepository ingredienteRepository) {
        super(baseRepository);
        this.ingredienteRepository = ingredienteRepository;
    }

    @Override
    public List<Ingrediente> search(String filtro) throws Exception {
        try {
            List<Ingrediente> ingredientes = ingredienteRepository.searchNativo(filtro);

            return ingredientes;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Ingrediente> search(String filtro, Pageable pageable) throws Exception {
        try {
            Page<Ingrediente> ingredientes = ingredienteRepository.searchNativo(filtro, pageable);

            return ingredientes;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}