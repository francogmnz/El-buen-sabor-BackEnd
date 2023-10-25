package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "DetalleOrdenCompra")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DetalleOrdenCompra extends Base{

    @NotNull
    private Integer cantidadDetalleCompra;

    @NotNull
    private Double precioUnitarioDetalleCompra;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_ingrediente")
    private Ingrediente ingrediente;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_comprobante")
    private Comprobante comprobante;
}
