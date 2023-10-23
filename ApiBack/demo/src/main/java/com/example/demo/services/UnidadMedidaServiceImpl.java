package com.example.demo.services;

import com.example.demo.entities.UnidadMedida;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.UnidadMedidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnidadMedidaServiceImpl extends BaseServiceImpl<UnidadMedida, Long> implements UnidadMedidaService{
    @Autowired
    private UnidadMedidaRepository unidadmedidaRepository;

    public UnidadMedidaServiceImpl(BaseRepository<UnidadMedida, Long> baseRepository, UnidadMedidaRepository unidadmedidaRepository) {
        super(baseRepository);
        this.unidadmedidaRepository = unidadmedidaRepository;
    }

    @Override
    public List<UnidadMedida> search(String filtro) throws Exception {
        try {
            //List<UnidadMedida> unidadesmedida = unidadmedidaRepository.findByDenominacionContaining(filtro, filtro);
            //List<UnidadMedida> unidadesmedida = unidadmedidaRepository.search(filtro);
            List<UnidadMedida> unidadesmedida = unidadmedidaRepository.searchNativo(filtro);

            return unidadesmedida;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<UnidadMedida> search(String filtro, Pageable pageable) throws Exception {
        try {
            //Page<UnidadMedida> unidadesmedida = unidadmedidaRepository.findByDenominacionContaining(filtro, filtro, pageable);
            //Page<UnidadMedida> unidadesmedida = unidadmedidaRepository.search(filtro, pageable);
            Page<UnidadMedida> unidadesmedida = unidadmedidaRepository.searchNativo(filtro, pageable);

            return unidadesmedida;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}