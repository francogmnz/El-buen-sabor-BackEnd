package com.example.demo.services;

import com.example.demo.entities.NotaCredito;
import com.example.demo.entities.OrdenCompra;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.NotaCreditoRepository;
import com.example.demo.repository.OrdenCompraRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrdenCompraServiceImpl extends BaseServiceImpl<OrdenCompra,Long> implements OrdenCompraService {
    @Autowired
    private OrdenCompraRepository ordenCompraRepository;

    public OrdenCompraServiceImpl(BaseRepository<OrdenCompra, Long> baseRepository, OrdenCompraRepository ordenCompraRepository) {
        super(baseRepository);
        this.ordenCompraRepository = ordenCompraRepository;
    }

    @Override
    public List<OrdenCompra> search(String filtro) throws Exception {
        try {
            //List<UnidadMedida> unidadesmedida = unidadmedidaRepository.findByDenominacionContaining(filtro, filtro);
            //List<UnidadMedida> unidadesmedida = unidadmedidaRepository.search(filtro);
            List<OrdenCompra> ordenCompra = ordenCompraRepository.searchNativo(filtro);

            return ordenCompra;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<OrdenCompra> search(String filtro, Pageable pageable) throws Exception {
        try {
            //Page<UnidadMedida> unidadesmedida = unidadmedidaRepository.findByDenominacionContaining(filtro, filtro, pageable);
            //Page<UnidadMedida> unidadesmedida = unidadmedidaRepository.search(filtro, pageable);
            Page<OrdenCompra> ordenCompra = ordenCompraRepository.searchNativo(filtro, pageable);

            return ordenCompra;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
