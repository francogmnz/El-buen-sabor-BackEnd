package com.example.demo.services;

import com.example.demo.entities.Ingrediente;
import com.example.demo.repository.BaseRepository;
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
    public List<Ingrediente> findAll() throws Exception {
        return null;
    }

    @Override
    public Page<Ingrediente> findAll(Pageable pageable) throws Exception {
        return null;
    }

    @Override
    public Ingrediente findById(Long aLong) throws Exception {
        return null;
    }

    @Override
    public Ingrediente save(Ingrediente entity) throws Exception {
        return null;
    }

    @Override
    public Ingrediente update(Long aLong, Ingrediente entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long aLong) throws Exception {
        return false;
    }
}