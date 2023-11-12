package com.example.demo.services;

import com.example.demo.dtos.DTORankingClientes;
import com.example.demo.entities.Cliente;
import com.example.demo.entities.Pedido;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.repository.UnidadMedidaRepository;
import com.example.demo.services.BaseServiceImpl;
import com.example.demo.services.ClienteService;
import jakarta.transaction.Transactional;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
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
            //List<Cliente> clientes = clienteRepository.findByDenominacionContaining(filtro, filtro);
            //List<Cliente> clientes = clienteRepository.search(filtro);
            List<Cliente> clientes = clienteRepository.searchNativo(filtro);

            return clientes;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Cliente> search(String filtro, Pageable pageable) throws Exception {
        try {
            //Page<Cliente> clientes = clienteRepository.findByDenominacionContaining(filtro, filtro, pageable);
            //Page<Cliente> clientes = clienteRepository.search(filtro, pageable);
            Page<Cliente> cliente = clienteRepository.searchNativo(filtro, pageable);

            return cliente;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    public List<Cliente> findClientesConMasPedidosEnRangoFechas (@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fechaInicio, @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fechaFin) throws Exception {
        try {
            List<Cliente> clientes = clienteRepository.findClientesConMasPedidosEnRangoFechas(fechaInicio,fechaFin);
            return clientes;
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
}