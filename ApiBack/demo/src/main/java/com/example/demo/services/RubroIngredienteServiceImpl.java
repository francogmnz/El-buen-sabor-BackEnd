package com.example.demo.services;

import com.example.demo.entities.RubroIngrediente;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.RubroIngredienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RubroIngredienteServiceImpl extends BaseServiceImpl<RubroIngrediente, Long> implements BaseService<RubroIngrediente, Long> {

    private final RubroIngredienteRepository rubroIngredienteRepository;

    public RubroIngredienteServiceImpl(BaseRepository<RubroIngrediente, Long> baseRepository, RubroIngredienteRepository rubroIngredienteRepository) {
        super(baseRepository);
        this.rubroIngredienteRepository = rubroIngredienteRepository;
    }

    @Override
    public List<RubroIngrediente> findAll() throws Exception {
        // Implementación para buscar todos los rubros de ingredientes en la base de datos
        return rubroIngredienteRepository.findAll();
    }

    @Override
    public RubroIngrediente findById(Long id) throws Exception {
        // Implementación para buscar un rubro de ingrediente por su ID
        return rubroIngredienteRepository.findById(id).orElse(null);
    }

    @Override
    public RubroIngrediente save(RubroIngrediente entity) throws Exception {
        // Implementación para guardar un rubro de ingrediente en la base de datos
        return rubroIngredienteRepository.save(entity);
    }

    @Override
    public RubroIngrediente update(Long id, RubroIngrediente entity) throws Exception {
        // Implementación para actualizar un rubro de ingrediente existente por su ID
        RubroIngrediente existingRubroIngrediente = rubroIngredienteRepository.findById(id).orElse(null);
        if (existingRubroIngrediente != null) {
            // Realizar las actualizaciones necesarias en existingRubroIngrediente
            // Luego, guardar el rubro de ingrediente actualizado
            return rubroIngredienteRepository.save(existingRubroIngrediente);
        }
        return null;
    }

    @Override
    public boolean delete(Long id) throws Exception {
        // Implementación para eliminar un rubro de ingrediente por su ID
        RubroIngrediente existingRubroIngrediente = rubroIngredienteRepository.findById(id).orElse(null);
        if (existingRubroIngrediente != null) {
            rubroIngredienteRepository.delete(existingRubroIngrediente);
            return true;
        }
        return false;
    }
}