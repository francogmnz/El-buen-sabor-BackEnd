package com.example.demo.services;

import com.example.demo.entities.Receta;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.RecetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RecetaServiceImpl extends BaseServiceImpl<Receta,Long> implements BaseService<Receta,Long> {

    @Autowired
    private RecetaRepository recetaRepository;

    public RecetaServiceImpl(BaseRepository<Receta, Long> baseRepository, RecetaRepository recetaRepository) {
        super(baseRepository);
        this.recetaRepository = recetaRepository;
    }
    @Override
    public List<Receta> findAll() throws Exception {
        return null;
    }

    @Override
    public Page<Receta> findAll(Pageable pageable) throws Exception {
        return null;
    }

    @Override
    public Receta findById(Long aLong) throws Exception {
        return null;
    }

    @Override
    public Receta save(Receta entity) throws Exception {
        return null;
    }

    @Override
    public Receta update(Long aLong, Receta entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long aLong) throws Exception {
        return false;
    }
}
