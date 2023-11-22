package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;

@Entity
@Table(name = "DetallePedido")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class DetallePedido extends Base {

    @NotNull
    @Column(name = "cantidad")
    private Integer cantidad;

    @NotNull
    @Column(name = "subtotal", precision = 10, scale = 2)
    private BigDecimal subtotal;

    @NotNull
    @Column(name = "subtotal_costo", precision = 10, scale = 2)
    private BigDecimal subtotalCosto;

    @ManyToOne()
    @JoinColumn(name = "id_producto")
    private Producto producto;


}
