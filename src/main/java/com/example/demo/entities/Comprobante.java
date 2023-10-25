package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "comprobante")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Comprobante extends Base {
    @NotNull
    private String numero;
    @NotNull
    @Column(name = "total", precision = 10, scale = 2)
    private BigDecimal total;

    // Constructor, getters y setters
}
