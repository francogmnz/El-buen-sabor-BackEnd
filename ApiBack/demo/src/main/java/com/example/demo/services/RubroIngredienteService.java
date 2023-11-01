package com.example.demo.services;

import com.example.demo.entities.Cliente;
import com.example.demo.entities.Factura;
import com.example.demo.entities.RubroIngrediente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RubroIngredienteService extends BaseService <RubroIngrediente,Long> {
    List<RubroIngrediente> search(String filtro) throws Exception;
    Page<RubroIngrediente> search(String filtro, Pageable pageable) throws Exception;

}
