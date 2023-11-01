package com.example.demo.services;

import com.example.demo.entities.RubroProducto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RubroProductoService extends BaseService<RubroProducto, Long>{
    List<RubroProducto> search(String filtro) throws Exception;
    Page<RubroProducto> search(String filtro, Pageable pageable) throws Exception;


}
