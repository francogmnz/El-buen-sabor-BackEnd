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
@Table(name = "rubro_articulo")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RubroIngrediente extends Base {


    @ManyToOne()
    @JoinColumn(name = "id_rubro_padre")
    private RubroIngrediente rubroPadre;

    @OneToMany(mappedBy = "rubroPadre")
    private List<RubroIngrediente> subRubros;

    @NotNull
    private String denominacion;

    public RubroIngrediente(String denominacion, RubroIngrediente rubroPadre) {
        this.denominacion = denominacion;
        this.rubroPadre = rubroPadre;
    }

    public void setSubRubros(List<RubroIngrediente> subRubros) {
        this.subRubros.clear();
        this.subRubros.addAll(subRubros);
    }
}
