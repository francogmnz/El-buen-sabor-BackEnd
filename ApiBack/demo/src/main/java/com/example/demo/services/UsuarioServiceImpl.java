package com.example.demo.services;

import com.example.demo.entities.*;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.RubroIngredienteRepository;
import com.example.demo.repository.UnidadMedidaRepository;
import com.example.demo.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl extends BaseServiceImpl<Usuario, Long> implements UsuarioService{


    @Autowired
    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }


    private UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(BaseRepository<Usuario, Long> baseRepository) {

        super(baseRepository);
    }

    @Override
    public List<Usuario> search(String filtro) throws Exception {
        try {
            List<Usuario> usuarios = usuarioRepository.searchNativo(filtro);

            return usuarios;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public Page<Usuario> search(String filtro, Pageable pageable) throws Exception {
        try {
            Page<Usuario> usuarios = usuarioRepository.searchNativo(filtro, pageable);

            return usuarios;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}