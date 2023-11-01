package com.example.demo.services;
import com.example.demo.entities.Cliente;
import com.example.demo.entities.Ingrediente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IngredienteService extends BaseService<Ingrediente,Long>{
    List<Ingrediente> bajoStock() throws Exception;

}
