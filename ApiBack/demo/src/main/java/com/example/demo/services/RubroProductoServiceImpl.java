package com.example.demo.services;

import com.example.demo.entities.RubroProducto;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.RubroProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RubroProductoServiceImpl extends BaseServiceImpl<RubroProducto,Long> implements  RubroProductoService{
    private final RubroProducto rubroProducto;
    public RubroProductoServiceImpl(BaseRepository<RubroProducto,Long> baseRepository){

        super(baseRepository);
        this.rubroProducto = rubroProducto;
    }
    @Override
    public List<RubroProducto> findAll() throws Exception {
        // Implementación para buscar todos los rubros de ingredientes en la base de datos
        return RubroProductoRepository.findAll();
    }

    @Override
    public RubroProducto findById(Long id) throws Exception {
        // Implementación para buscar un rubro de ingrediente por su ID
        return RubroProductoRepository.findById(id).orElse(null);
    }

    @Override
    public RubroProducto save(RubroProducto entity) throws Exception {
        // Implementación para guardar un rubro de ingrediente en la base de datos
        return RubroProductoRepository.save(entity);
    }

    @Override
    public RubroProducto update(Long id, RubroProducto entity) throws Exception {
        // Implementación para actualizar un rubro de ingrediente existente por su ID
        RubroProducto existingRubroProducto = RubroProductoRepository.findById(id).orElse(null);
        if (existingRubroProducto != null) {
            // Realizar las actualizaciones necesarias en existingRubroIngrediente
            // Luego, guardar el rubro de ingrediente actualizado
            return RubroProductoRepository.save(existingRubroProducto);
        }
        return null;
    }

    @Override
    public boolean delete(Long id) throws Exception {
        // Implementación para eliminar un rubro de ingrediente por su ID
        RubroProducto existingRubroProducto = RubroProductoRepository.findById(id).orElse(null);
        if (existingRubroProducto != null) {
            RubroProductoRepository.delete(existingRubroProducto);
            return true;
        }
        return false;
    }
}
