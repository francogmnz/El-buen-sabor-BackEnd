package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Producto")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Producto extends Base {

    @NotNull
    private String denominacion;

    @NotNull
    @Column(length = 1000)
    private String descripcion;

    @NotNull
    @Column(name = "tiempo_estimado_cocina")
    private Integer tiempoEstimadoCocina;

    @NotNull
    @Column(name = "precio_venta", precision = 10, scale = 2)
    private BigDecimal precioVenta;

    @Column(name = "costo", precision = 10, scale = 2)
    private BigDecimal costo;

    @Column(length = 500, name = "url_imagen")
    private String urlImagen;

    @OneToOne()
    @JoinColumn(name = "id_receta")
    private Receta receta;

    @ManyToOne()
    @JoinColumn(name = "id_categoria")
    private RubroProducto rubroProducto;

    @NotNull
    @OneToMany
    @JoinColumn(name = "detalleProducto")
    private List<DetalleProducto> detalleproducto;

}
