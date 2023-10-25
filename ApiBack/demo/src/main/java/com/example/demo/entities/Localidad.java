package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "localidad")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Localidad  extends Base{
    private int id_localidad;

    @NotNull
    @Column(precision = 4, name="CodigoPostal")
    private Integer codigoPostal;

    @Column(name = "descripcionLocalidad")
    private String descripcionLocalidad;

    @NotNull
    @Column(name = "nombreLocalidad")
    private String nombreLocalidad;
}