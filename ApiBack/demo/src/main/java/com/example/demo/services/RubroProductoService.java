package com.example.demo.services;

import com.example.demo.entities.RubroProducto;

import java.util.List;

public interface RubroProductoService extends BaseService<RubroProducto, Long>{

        List<RubroProducto> search(String filtro) throws Exception;
    }
