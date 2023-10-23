package com.example.demo.services;


import com.example.demo.entities.RubroProducto;
import com.example.demo.repository.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class RubroProductoServiceImpl extends BaseServiceImpl<RubroProducto,Long> implements  RubroProductoService{
    public RubroProductoServiceImpl(BaseRepository<RubroProducto,Long> baseRepository){
        super(baseRepository);
    }
}
