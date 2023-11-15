package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Entity
@Builder
@Table(name = "RubroProducto")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RubroProducto extends Base {

    @Column(name = "descripcionCategoriaProducto")
    private String descripcionCategoriaProducto;

    @Column(name = "nombreCategoriaProducto")
    private String nombreCategoriaProducto;
}
