package com.tup.buensabor.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "articulo_insumo-receta")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class IngredienteReceta extends Base{
    @NotNull
    @Column(name = "cantidadAIR")
    private int cantidadAIR;

    @ManyToOne()
    @JoinColumn(name = "id_receta")
    private Receta receta;

    @ManyToOne()
    @JoinColumn(name = "id_articulo_insumo")
    private Producto producto;
}
