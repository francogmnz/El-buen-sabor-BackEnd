package com.example.demo.services;


import com.example.demo.entities.IngredienteReceta;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.IngredienteRecetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredienteRecetaServiceImpl extends BaseServiceImpl<IngredienteReceta, Long> implements IngredienteRecetaService {

    @Autowired
    private IngredienteRecetaRepository ingredienterecetaRepository;
    public IngredienteRecetaServiceImpl(BaseRepository<IngredienteReceta, Long> baseRepository, IngredienteRecetaRepository ingredienterecetaRepository) {
        super(baseRepository);
        this.ingredienterecetaRepository = ingredienterecetaRepository;
    }

    @Override
    public List<IngredienteReceta> search(int filtro) throws Exception {
        try {
            List<IngredienteReceta> ingredientesreceta = ingredienterecetaRepository.searchNativo(filtro);

            return ingredientesreceta;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<IngredienteReceta> search(int filtro, Pageable pageable) throws Exception {
        try {
            Page<IngredienteReceta> ingredientesreceta = ingredienterecetaRepository.searchNativo(filtro, pageable);

            return ingredientesreceta;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}