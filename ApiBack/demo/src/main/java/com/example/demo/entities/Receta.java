package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;

@Entity
@Table(name = "Receta")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Receta extends Base{

    @NotNull
    @Column(name = "numReceta")
    private int numReceta;

    @NotNull
    @Column(name = "descripcionReceta")
    private String descripcionReceta;

    @NotNull
    @Column(name = "nombreReceta")
    private String nombreReceta;

    @NotNull
    @Column(name = "instruccion")
    private String instruccion;

    @Column(name = "duracionReceta")
    private int duracionReceta;

    @ManyToOne(optional = true)
    @JoinColumn(name = "id_ingrediente_receta")
    private IngredienteReceta ingredienteReceta;
}
