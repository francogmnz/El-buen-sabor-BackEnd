package com.example.demo.services;

import com.example.demo.entities.Cliente;
import com.example.demo.entities.Receta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RecetaService extends BaseService<Receta, Long>{
    List<Receta> search(int filtro) throws Exception;
    List<Receta> searchO(int filtro) throws Exception;
    Page<Receta> search(int filtro, Pageable pageable) throws Exception;

}
