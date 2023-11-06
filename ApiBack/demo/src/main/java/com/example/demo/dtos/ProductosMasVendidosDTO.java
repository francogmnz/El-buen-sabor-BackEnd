package com.example.demo.dtos;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@ToString
public class ProductosMasVendidosDTO {
    private String denominacion;
    private String urlImagen;
    private Long totalVendido;

    public ProductosMasVendidosDTO(String denominacion, String urlImagen, Long totalVendido) {
        this.denominacion = denominacion;
        this.urlImagen = urlImagen;
        this.totalVendido = totalVendido;
    }
    public ProductosMasVendidosDTO() {
    }
    // Getters...
}