package com.example.demo.services;

import com.example.demo.dtos.ProductosMasVendidosDTO;
import com.example.demo.entities.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface ProductoService extends BaseService<Producto, Long>{
    public List<Producto> search (String filtro) throws Exception;
    Page<Producto> searchByNombre(String filtro, Pageable pageable) throws Exception;

    Page<Producto> searchByPrecioVenta(BigDecimal precioVenta, Pageable pageable) throws Exception;

    Page<Producto> searchByPrecioVentaRange(BigDecimal precioMinimo, BigDecimal precioMaximo, Pageable pageable) throws Exception;

    Page<Producto> searchByCategoriaNombre(String nombreCategoria, Pageable pageable) throws Exception;

    List<ProductosMasVendidosDTO> searchBestSelling() throws Exception;

}

