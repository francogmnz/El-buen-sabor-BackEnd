package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Domicilio")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Domicilio extends Base {

    @NotNull
    @Column(name = "calle", length = 500)
    private String calle;

    @NotNull
    @Column(name = "numero", precision = 5)
    private Integer numero;

    @Column(name = "numero_vivienda")
    private Integer numeroDpto;

    @Column(name = "piso_vivienda")
    private Integer pisoDpto;

    @ManyToOne()
    @JoinColumn(name = "id_localidad")
    private Localidad localidad;
}
