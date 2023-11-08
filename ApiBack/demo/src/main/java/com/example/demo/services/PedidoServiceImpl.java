package com.example.demo.services;

import com.example.demo.entities.Ingrediente;
import com.example.demo.entities.OrdenCompra;
import com.example.demo.entities.Pedido;
import com.example.demo.entities.Receta;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.OrdenCompraRepository;
import com.example.demo.repository.PedidoRepository;
import com.example.demo.repository.RecetaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class PedidoServiceImpl extends BaseServiceImpl<Pedido,Long> implements PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;
    public PedidoServiceImpl(BaseRepository<Pedido, Long> baseRepository, PedidoRepository pedidoRepository) {
        super(baseRepository);
        this.pedidoRepository = pedidoRepository;
    }


    public List<Pedido> search(Date filtro) throws Exception {
        try {
            List<Pedido> pedido = pedidoRepository.searchNativo(filtro);

            return pedido;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    public Page<Pedido> searchstatus(String estado, Pageable pageable) throws Exception {
        try {
            Page<Pedido> pedido = pedidoRepository.searchstatus(estado, pageable);

            return pedido;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


    public Page<Pedido> search(Date filtro, Pageable pageable) throws Exception {
        try {
            Page<Pedido> pedido = pedidoRepository.searchNativo(filtro, pageable);

            return pedido;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public List<Pedido> pedidoDelivery() throws Exception {
        try {
            List<Pedido> pedido = pedidoRepository.pedidoDelivery();
            return pedido;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public List<Pedido> searchCajero(String filtroc ) throws Exception {
        try {
            List<Pedido> pedido = pedidoRepository.searchCajero(filtroc );

            return pedido;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    public void cambioCajero(Long id, String cambio) throws Exception {
        try {
            // Realiza la operación de actualización llamando al método en el repositorio
            pedidoRepository.cambioCajero(cambio);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    @Transactional

    public void entregaCajero(Long id,String cambio ) throws Exception {
        try {
            pedidoRepository.entregaCajero(cambio);


        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    public List<Object[]> searchDelivery() throws Exception {
        try {
            List<Object[]> Object = pedidoRepository.searchDelivery();

            return Object;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    public void entregaDelivery(Long id) throws Exception {
        try {
             pedidoRepository.entregaDelivery();


        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
