package com.example.demo.services;

import com.example.demo.entities.Cliente;
import com.example.demo.entities.Ingrediente;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.repository.IngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class ClienteServiceImpl extends BaseServiceImpl<Cliente, Long> implements ClienteService {

    @Autowired
    private Cliente cliente;


    public ClienteServiceImpl(BaseRepository<Ingrediente, Long> baseRepository, Cliente cliente) {
        super(baseRepository);
        this.cliente = cliente;
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
