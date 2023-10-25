package com.example.demo.services;

import com.example.demo.entities.Cliente;
import com.example.demo.entities.UnidadMedida;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.repository.UnidadMedidaRepository;
import com.example.demo.services.BaseServiceImpl;
import com.example.demo.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl extends BaseServiceImpl<Cliente,Long> implements ClienteService{
    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteServiceImpl(BaseRepository<Cliente, Long> baseRepository, ClienteRepository clienteRepository) {
        super(baseRepository);
        this.clienteRepository = clienteRepository;
    }

    @Override
    public List<Cliente> search(String filtro) throws Exception {
        try {
            //List<UnidadMedida> unidadesmedida = unidadmedidaRepository.findByDenominacionContaining(filtro, filtro);
            //List<UnidadMedida> unidadesmedida = unidadmedidaRepository.search(filtro);
            List<Cliente> clientes = clienteRepository.searchNativo(filtro);

            return clientes;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Cliente> search(String filtro, Pageable pageable) throws Exception {
        try {
            //Page<UnidadMedida> unidadesmedida = unidadmedidaRepository.findByDenominacionContaining(filtro, filtro, pageable);
            //Page<UnidadMedida> unidadesmedida = unidadmedidaRepository.search(filtro, pageable);
            Page<Cliente> cliente = clienteRepository.searchNativo(filtro, pageable);

            return cliente;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}

