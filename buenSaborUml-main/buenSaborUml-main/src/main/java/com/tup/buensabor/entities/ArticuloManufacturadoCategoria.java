package com.tup.buensabor.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "artManFac")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArticuloManufacturadoCategoria extends Base{
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_articulo_manufacturado")
    private ArticuloManufacturado artManufacturado;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;
}

