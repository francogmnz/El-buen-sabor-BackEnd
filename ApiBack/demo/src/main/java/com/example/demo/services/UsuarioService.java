package com.example.demo.services;

import com.example.demo.entities.Cliente;
import com.example.demo.entities.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsuarioService extends BaseService<Usuario, Long>{
    List<Usuario> search(String filtro) throws Exception;

}
