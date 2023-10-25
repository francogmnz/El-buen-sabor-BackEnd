package com.example.demo.services;

import com.example.demo.entities.Ingrediente;
import com.example.demo.entities.NotaCredito;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.NotaCreditoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NotaCreditoServiceImpl extends BaseServiceImpl<NotaCredito,Long> {

    public NotaCreditoServiceImpl(BaseRepository<Ingrediente, Long> baseRepository) {
        super(baseRepository);
    }
}


