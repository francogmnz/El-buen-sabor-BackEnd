package com.example.demo.services;

import com.example.demo.entities.Factura;
import com.example.demo.entities.RubroIngrediente;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.FacturaRepository;
import com.example.demo.repository.RubroIngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

public  class RubroIngredienteServiceImpl extends BaseServiceImpl<RubroIngrediente,Long> implements BaseService<RubroIngrediente, Long> {
    @Autowired
    private RubroIngredienteRepository rubroIngredienteRepository;

    public RubroIngredienteServiceImpl(BaseRepository<RubroIngrediente, Long> baseRepository, RubroIngredienteRepository rubroIngredienteRepository) {
        super(baseRepository);
        this.rubroIngredienteRepository = rubroIngredienteRepository;
    }
}