package com.example.demo.services;

import com.example.demo.dtos.DTORankingClientes;
import com.example.demo.entities.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface ClienteService extends BaseService<Cliente, Long> {
    List<Cliente> search(String filtro) throws Exception;
    Page<Cliente> search(String filtro, Pageable pageable) throws Exception;
    List<DTORankingClientes> searchRankingClientes (Date fecha1, Date fecha2) throws Exception;

}
