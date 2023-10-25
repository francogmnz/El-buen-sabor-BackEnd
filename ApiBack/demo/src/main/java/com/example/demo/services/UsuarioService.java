package com.example.demo.services;

import com.example.demo.entities.Usuario;

import java.util.List;

public interface UsuarioService extends BaseService<Usuario, Long>{
    public List<Usuario> search (String filtro) throws Exception;
}
