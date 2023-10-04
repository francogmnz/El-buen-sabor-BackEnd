package com.tup.buensabor.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "DetalleOrdenCompra")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DetalleOrdenCompra extends Base{
}
