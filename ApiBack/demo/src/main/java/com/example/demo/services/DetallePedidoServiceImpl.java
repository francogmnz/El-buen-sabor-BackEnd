package com.example.demo.services;

import com.example.demo.entities.DetallePedido;
import com.example.demo.entities.Ingrediente;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.DetallePedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetallePedidoServiceImpl extends BaseServiceImpl<DetallePedido, Long> implements BaseService<DetallePedido, Long> {

    @Autowired
    private DetallePedidoRepository detallePedidoRepository;

    public DetallePedidoServiceImpl(BaseRepository<Ingrediente, Long> baseRepository, DetallePedidoRepository detallePedidoRepository) {
        super(baseRepository);
        this.detallePedidoRepository = detallePedidoRepository;
    }

    @Override
    public List<DetallePedido> findAll() throws Exception {
        // Implementación para buscar todas las facturas en la base de datos
        return detallePedidoRepository.findAll();
    }

    @Override
    public Page<DetallePedido> findAll(Pageable pageable) throws Exception {
        // Implementación para buscar todas las facturas con paginación
        return detallePedidoRepository.findAll(pageable);
    }

    @Override
    public DetallePedido findById(Long aLong) throws Exception {
        // Implementación para buscar una factura por su ID
        return detallePedidoRepository.findById(aLong).orElse(null);
    }

    @Override
    public DetallePedido save(DetallePedido entity) throws Exception {
        // Implementación para guardar una factura en la base de datos
        return detallePedidoRepository.save(entity);
    }

    @Override
    public DetallePedido update(Long aLong, DetallePedido entity) throws Exception {
        // Implementación para actualizar una factura existente por su ID
        DetallePedido existingDetallePedido = detallePedidoRepository.findById(aLong).orElse(null);
        if (existingDetallePedido != null) {
            // Realizar las actualizaciones necesarias en existingFactura
            // Luego, guardar la factura actualizada
            return detallePedidoRepository.save(existingDetallePedido);
        }
        return null;
    }

    @Override
    public boolean delete(Long aLong) throws Exception {
        // Implementación para eliminar una factura por su ID
        DetallePedido existingDetallePedido = detallePedidoRepository.findById(aLong).orElse(null);
        if (existingDetallePedido != null) {
            detallePedidoRepository.delete(existingDetallePedido);
            return true;
        }
        return false;
    }

    //@Override
    public List<DetallePedido> search(String filtro) throws Exception {
        try {
            List<DetallePedido> detallePedido = detallePedidoRepository.searchNativo(filtro);

            return detallePedido;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    //@Override
    public Page<DetallePedido> search(String filtro, Pageable pageable) throws Exception {
        try {
            Page<DetallePedido> detallePedido = detallePedidoRepository.searchNativo(filtro, pageable);

            return detallePedido;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}

