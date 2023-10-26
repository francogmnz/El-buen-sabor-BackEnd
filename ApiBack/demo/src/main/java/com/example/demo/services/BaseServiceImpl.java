package com.example.demo.services;


import com.example.demo.entities.Base;
import com.example.demo.entities.Ingrediente;
import com.example.demo.repository.BaseRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl<E extends Base, ID extends Serializable> implements BaseService<E, ID> {

    protected BaseRepository<E, ID> baseRepository;

    public BaseServiceImpl(BaseRepository<Ingrediente, Long> baseRepository) {
        this.baseRepository = (BaseRepository<E, ID>) baseRepository;
    }

    @Override
    @Transactional
    public List<E> findAll() throws Exception {
        try {
            System.out.println("Estot en servicio antes de llamar al repo");
            List<E> entities = baseRepository.findAll();
            System.out.println("Estoy en el service despues de llamar");
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
  @Override
  @Transactional
  public Page<E> findAll(Pageable pageable) throws Exception { try {
        Page<E> entities = baseRepository.findAll(pageable);
        return entities;
    } catch (Exception e) {
        throw new Exception(e.getMessage());
    }
    }
    @Override
    @Transactional
    public E findById(ID id) throws Exception {
        try {
            Optional<E> entityOptional = baseRepository.findById(id);
            return entityOptional.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E save(E entity) throws Exception {
        try {
            entity = baseRepository.save(entity);
            return entity;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E update(ID id, E entity) throws Exception {
        try {
            Optional<E> entityOptional = baseRepository.findById(id);
            E e = entityOptional.get();
            e = baseRepository.save(entity);
            return e;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(ID id) throws Exception {
        try {
            if (baseRepository.existsById(id)){
                baseRepository.deleteById(id);
                return true;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
