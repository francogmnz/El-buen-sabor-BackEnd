package com.example.demo.services;

import com.example.demo.entities.Ingrediente;
import com.example.demo.entities.Receta;
import com.example.demo.entities.RubroIngrediente;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.RecetaRepository;
import com.example.demo.repository.RubroIngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RubroIngredienteServiceImpl extends BaseServiceImpl<RubroIngrediente, Long> implements RubroIngredienteService {

    @Autowired
    private RubroIngredienteRepository rubroingredienteRepository;
    public RubroIngredienteServiceImpl(BaseRepository<RubroIngrediente, Long> baseRepository, RubroIngredienteRepository rubroingredienteRepository) {
        super(baseRepository);
        this.rubroingredienteRepository = rubroingredienteRepository;
    }

    public List<RubroIngrediente> search(String filtro) throws Exception {
        try {
            List<RubroIngrediente> rubroingrediente = rubroingredienteRepository.searchNativo(filtro);

            return rubroingrediente;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public Page<RubroIngrediente> search(String filtro, Pageable pageable) throws Exception {
        try {
            Page<RubroIngrediente> rubroingrediente = rubroingredienteRepository.searchNativo(filtro, pageable);

            return rubroingrediente;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }}

