package com.tup.buensabor.entities;

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
public class OrdenCompra extends Base{

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraOrdenCompra;

    @NotNull
    private double montoTotalOrdenCompra;

    @NotNull
    private int numOrdenCompra;

    @NotNull
    @OneToMany(mappedBy = "DetalleOrdenCompra")
    @JoinColumn(name = "detalleOrdenCompra")
    private List<DetalleOrdenCompra> detalleOrdenCompra;
}
