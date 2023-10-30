package com.example.demo.entities;

import jakarta.persistence.*;
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
    @Column(name = "cantidadDetalleOrdenCompra")
    private Integer cantidadDetalleOrdenCompra;

    @NotNull
    @Column(name = "precioUnitarioDetalleCompra")
    private Integer precioUnitarioDetalleCompra;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_ingrediente")
    private Ingrediente ingrediente;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_comprobante")
    private Comprobante comprobante;

    

}
