package com.example.demo.services;

import com.example.demo.entities.Ingrediente;
import com.example.demo.entities.Producto;
import com.example.demo.entities.Usuario;
import com.example.demo.repository.BaseRepository;
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
    private UsuarioRepository usuarioRepository;
    public UsuarioServiceImpl(BaseRepository<Ingrediente, Long> baseRepository) {
        super(baseRepository);
    }

    @Transactional
    @Override
    public List<Usuario> search(String filtro) throws Exception{
        try{
            //return personaRepository.findByNombreContainingOrApellidoContaining(filtro, filtro);
            //return personaRepository.searchJPQL(filtro);
            return usuarioRepository.searchNative(filtro);
        }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }
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
}
