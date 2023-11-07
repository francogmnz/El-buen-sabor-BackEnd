package com.example.demo.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class DTORankingClientes {
        private String nombre;
        private String apellido;
        private int cantPedidos;
        private BigDecimal importeTotal;

    public DTORankingClientes(String nombre, String apellido, int cantPedidos, BigDecimal importeTotal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cantPedidos = cantPedidos;
        this.importeTotal = importeTotal;
    }
}


