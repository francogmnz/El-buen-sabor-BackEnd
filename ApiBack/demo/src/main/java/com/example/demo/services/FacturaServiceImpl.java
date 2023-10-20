package com.example.demo.services;

import com.example.demo.entities.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaServiceImpl extends BaseServiceImpl<Factura,Long> implements FacturaService{

    @Autowired
    private AutorRepoository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository, AutorRepoository autorRepository) {
        super(baseRepository);
        this.autorRepository = autorRepository;
    }
}
