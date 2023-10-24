package com.example.demo.services;

import com.example.demo.entities.NotaCredito;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.NotaCreditoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class NotaCreditoServiceImpl extends BaseServiceImpl<NotaCredito,Long>  implements NotaCreditoService {

    @Autowired
    private NotaCreditoRepository notaCreditoRepository;
    public NotaCreditoServiceImpl(BaseRepository<NotaCredito, Long> baseRepository, NotaCreditoRepository notaCreditoRepository) {
        super(baseRepository);
        this.notaCreditoRepository = notaCreditoRepository;
    }

    @Override
    public List<NotaCredito> findAll() throws Exception {
        return null;
    }

    @Override
    public Page<NotaCredito> findAll(Pageable pageable) throws Exception {
        return null;
    }

    @Override
    public NotaCredito findById(Long aLong) throws Exception {
        return null;
    }

    @Override
    public NotaCredito save(NotaCredito entity) throws Exception {
        return null;
    }

    @Override
    public NotaCredito update(Long aLong, NotaCredito entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long aLong) throws Exception {
        return false;
    }
}
