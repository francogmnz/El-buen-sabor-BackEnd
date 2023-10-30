package com.example.demo.services;

import com.example.demo.entities.Cliente;
import com.example.demo.entities.IngredienteReceta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IngredienteRecetaService extends BaseService<IngredienteReceta, Long>{

    List<IngredienteReceta> search(int filtro) throws Exception;
    Page<IngredienteReceta> search(int filtro, Pageable pageable) throws Exception;

}
