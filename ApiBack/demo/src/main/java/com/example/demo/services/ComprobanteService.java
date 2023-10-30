package com.example.demo.services;
import com.example.demo.entities.Cliente;
import com.example.demo.entities.Comprobante;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ComprobanteService extends BaseService<Comprobante,Long>{
    List<Comprobante> search(int filtro) throws Exception;
    Page<Comprobante> search(int filtro, Pageable pageable) throws Exception;

}
