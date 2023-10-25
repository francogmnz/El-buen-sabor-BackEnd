package com.example.demo.services;

import com.example.demo.entities.Ingrediente;
import com.example.demo.entities.RubroProducto;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.RubroProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RubroProductoServiceImpl extends BaseServiceImpl<RubroProducto, Long> implements RubroProductoService{

    @Autowired
    private RubroProductoRepository rubroProductoRepository;

    public RubroProductoServiceImpl(BaseRepository<Ingrediente, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<RubroProducto> search(String filtro) throws Exception {
        try {
            List<RubroProducto> rubros = rubroProductoRepository.searchNativa(filtro);
            return rubros;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}