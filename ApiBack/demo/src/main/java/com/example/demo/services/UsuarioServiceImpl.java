package com.example.demo.services;

import com.example.demo.entities.Producto;
import com.example.demo.entities.Usuario;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl extends BaseServiceImpl<Usuario, Long> implements UsuarioService{
    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(BaseRepository<Usuario, Long> baseRepository, UsuarioRepository usuarioRepository) {
        super(baseRepository);
    }

    @Override
    public List<Usuario> findAll() throws Exception {
        return null;
    }

    @Override
    public Page<Usuario> findAll(Pageable pageable) throws Exception {
        return null;
    }

    @Override
    public Usuario findById(Long aLong) throws Exception {
        return null;
    }

    @Override
    public Usuario save(Usuario entity) throws Exception {
        return null;
    }

    @Override
    public Usuario update(Long aLong, Usuario entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long aLong) throws Exception {
        return false;
    }

    @Override
    public List<Usuario> search(String filtro) throws Exception {
        try {
            List<Usuario> usuarios = usuarioRepository.search(filtro);
            return usuarios;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Usuario> search(String filtro, Pageable pageable) throws Exception {

        try {
            Page<Usuario> usuarios = usuarioRepository.search(filtro, pageable);
            return usuarios;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
