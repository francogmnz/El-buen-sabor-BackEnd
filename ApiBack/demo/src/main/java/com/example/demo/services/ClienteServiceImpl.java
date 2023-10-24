package com.example.demo.services;

import com.example.demo.entities.Cliente;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ClienteServiceImpl extends BaseServiceImpl<Cliente,Long>  implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    public ClienteServiceImpl(BaseRepository<Cliente,Long> baseRepository, ClienteRepository clienteRepository){
        super(baseRepository);
        this.clienteRepository= clienteRepository;
    }

    @Override
    public List<Cliente> findAll() throws Exception {
        return null;
    }

    @Override
    public Page<Cliente> findAll(Pageable pageable) throws Exception {
        return null;
    }

    @Override
    public Cliente findById(Long aLong) throws Exception {
        return null;
    }

    @Override
    public Cliente save(Cliente entity) throws Exception {
        return null;
    }

    @Override
    public Cliente update(Long aLong, Cliente entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long aLong) throws Exception {
        return false;
    }
}
