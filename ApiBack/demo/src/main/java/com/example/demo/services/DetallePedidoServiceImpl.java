package com.example.demo.services;

import com.example.demo.entities.DetallePedido;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.DetallePedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DetallePedidoServiceImpl extends BaseServiceImpl<DetallePedido,Long> implements DetallePedidoService{

    private final DetallePedidoRepository detallePedidoRepository;
    public DetallePedidoServiceImpl(BaseRepository<DetallePedido,Long> baseRepository){

        super(baseRepository);
        this.detallePedidoRepository = detallePedidoRepository;
    }


    @Override
    public List<DetallePedido> findAll() throws Exception {
        // Implementación para buscar todos los rubros de ingredientes en la base de datos
        return detallePedidoRepository.findAll();
    }

    @Override
    public DetallePedido findById(Long id) throws Exception {
        // Implementación para buscar un rubro de ingrediente por su ID
        return detallePedidoRepository.findById(id).orElse(null);
    }

    @Override
    public DetallePedido save(DetallePedido entity) throws Exception {
        // Implementación para guardar un rubro de ingrediente en la base de datos
        return detallePedidoRepository.save(entity);
    }

    @Override
    public DetallePedido update(Long id, DetallePedido entity) throws Exception {
        // Implementación para actualizar un rubro de ingrediente existente por su ID
        DetallePedido existingDetallePedido = detallePedidoRepository.findById(id).orElse(null);
        if (existingDetallePedido != null) {
            // Realizar las actualizaciones necesarias en existingRubroIngrediente
            // Luego, guardar el rubro de ingrediente actualizado
            return detallePedidoRepository.save(existingDetallePedido);
        }
        return null;
    }

    @Override
    public boolean delete(Long id) throws Exception {
        // Implementación para eliminar un rubro de ingrediente por su ID
        DetallePedido existingDetallePedido = detallePedidoRepository.findById(id).orElse(null);
        if (existingDetallePedido != null) {
            detallePedidoRepository.delete(existingDetallePedido);
            return true;
        }
        return false;
    }
}
