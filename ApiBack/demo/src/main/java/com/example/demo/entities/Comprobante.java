package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


@Entity
@Table(name = "Comprobante")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Comprobante extends Base {

    @NotNull
    private String numero;
    @NotNull
    @Column(name = "total", precision = 10, scale = 2)
    private BigDecimal total;

    // Constructor, getters y setters
}
