package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "OrdenCompra")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OrdenCompra extends Comprobante {

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fechaHoraOrdenCompra")
    private Date fechaHoraOrdenCompra;

    @NotNull
    @Column(name = "montoTotalOrdenCompra")
    private double montoTotalOrdenCompra;

    @NotNull
    @Column(name = "numOrdenCompra")
    private int numOrdenCompra;

}
