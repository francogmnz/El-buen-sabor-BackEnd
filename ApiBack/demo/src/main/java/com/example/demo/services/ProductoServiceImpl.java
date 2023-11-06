package com.example.demo.services;

import com.example.demo.dtos.ProductosMasVendidosDTO;
import com.example.demo.entities.Producto;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.ProductoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class ProductoServiceImpl extends BaseServiceImpl<Producto, Long> implements ProductoService{
    @Autowired
    private ProductoRepository productoRepository;
    public ProductoServiceImpl(BaseRepository<Producto, Long> baseRepository, ProductoRepository productoRepository) {
        super(baseRepository);
        this.productoRepository = productoRepository;
    }

    @Transactional
    @Override
    public List<Producto> search(String filtro) throws Exception{
        try{
            return productoRepository.searchNative(filtro);
        }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Producto> searchByNombre(String filtro, Pageable pageable) throws Exception {
        try {

            Page<Producto> Productos = productoRepository.searchByNombre(filtro, pageable);

            return Productos;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Producto> searchByPrecioVenta(BigDecimal precioVenta, Pageable pageable) throws Exception {
        try {

            Page<Producto> Productos = productoRepository.searchByPrecioVenta(precioVenta, pageable);

            return Productos;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Producto> searchByPrecioVentaRange(BigDecimal precioMinimo, BigDecimal precioMaximo, Pageable pageable) throws Exception {
        try {

            Page<Producto> Productos = productoRepository.searchByPrecioVentaRange(precioMinimo, precioMaximo, pageable);

            return Productos;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Producto> searchByCategoriaNombre(String nombreCategoria, Pageable pageable) throws Exception {
        try {

            Page<Producto> Productos = productoRepository.searchByCategoriaNombre(nombreCategoria, pageable);

            return Productos;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Override
    @Transactional
    public List<ProductosMasVendidosDTO> searchBestSelling(Date fechaInicio, Date fechaFin) throws Exception {
        try {
            List<Object[]> results = productoRepository.searchBestSelling(fechaInicio, fechaFin);
            List<ProductosMasVendidosDTO> dtos = new ArrayList<>();

            for (Object[] result : results) {
                String denominacion = (String) result[0];
                String urlImagen = (String) result[1];
                Long totalVendido = (Long) result[2];

                dtos.add(new ProductosMasVendidosDTO(denominacion, urlImagen, totalVendido));
            }

            return dtos;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
