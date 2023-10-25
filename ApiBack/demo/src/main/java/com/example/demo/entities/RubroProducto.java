package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "Categoria")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class
RubroProducto extends Base{
    private String descripcionCategoria;
    private Date fechaHoraBaja;
    private String nombreCategoria;
}
