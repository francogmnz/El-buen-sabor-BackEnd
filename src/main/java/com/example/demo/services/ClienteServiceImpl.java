package com.example.demo.services;

import com.example.demo.entities.Cliente;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.services.BaseServiceImpl;
import com.example.demo.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl extends BaseServiceImpl<Cliente,Long>{
    public ClienteServiceImpl(BaseRepository<Cliente, Long> baseRepository) {
        super(baseRepository);
    }
}

