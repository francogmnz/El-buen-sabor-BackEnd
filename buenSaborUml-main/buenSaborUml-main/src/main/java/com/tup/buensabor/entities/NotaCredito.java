package com.tup.buensabor.entities;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;

@Entity
@Table(name = "NotaDeCredito")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class NotaCredito extends Base {

    @NotNull
    @Column(name = "Fecha_Nota_Credito")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNotaDeCredito;

    @Column(name = "Importe")
    private double importeNDC;

    @Column(name = "Descripción")
    private String descripcionNDC;

    @NotNull
    @OneToOne
    @JoinColumn(name = "id_factura")
    private Factura factura;

}
