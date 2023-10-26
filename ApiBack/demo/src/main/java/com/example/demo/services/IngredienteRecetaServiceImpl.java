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
public class IngredienteRecetaServiceImpl extends BaseServiceImpl<IngredienteReceta, Long> implements IngredienteRecetaService {

    @Autowired
    private IngredienteRecetaRepository ingredienteRecetaRepository;
    public IngredienteRecetaServiceImpl(BaseRepository<Ingrediente, Long> baseRepository, IngredienteRepository ingredienteRepository) {
        super(baseRepository);
        this.ingredienteRecetaRepository = ingredienteRecetaRepository;
    }
    @Override
    public List<IngredienteReceta> findAll() throws Exception {
        return null;
    }

    @Override
    public Page<IngredienteReceta> findAll(Pageable pageable) throws Exception {
        return null;
    }

    @Override
    public IngredienteReceta findById(Long aLong) throws Exception {
        return null;
    }


    @Override
    public boolean delete(Long aLong) throws Exception {
        return false;
    }
}