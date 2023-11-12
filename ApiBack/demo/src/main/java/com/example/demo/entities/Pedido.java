package com.example.demo.entities;


import com.example.demo.enums.EstadoPagoPedido;
import com.example.demo.enums.EstadoPedido;
import com.example.demo.enums.FormaPago;
import com.example.demo.enums.TipoEnvio;
import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Pedido")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Pedido extends Base {

    @NotNull
    @Column(name = "fecha_pedido")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPedido;

    @NotNull
    @Column(name = "hora_estimada_finalizacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaEstimadaFinalizacion;

    @NotNull
    @Column(name = "total", precision = 10, scale = 2)
    private BigDecimal total;

    @NotNull
    @Column(name = "total_costo", precision = 10, scale = 2)
    private BigDecimal totalCosto;

    @NotNull
    @Enumerated(EnumType.STRING)
    private EstadoPedido estado;


    @NotNull
    @Column(name = "estado_pago")
    @Enumerated(EnumType.STRING)
    private EstadoPagoPedido estadoPago;

    @NotNull
    @Column(name = "tipo_envio")
    @Enumerated(EnumType.STRING)
    private TipoEnvio tipoEnvio;

    @NotNull
    @Column(name = "forma_pago")
    @Enumerated(EnumType.STRING)
    private FormaPago formaPago;

    @ManyToOne()
    @JoinColumn(name = "id_domicilio")
    private Domicilio domicilio;

    @NotNull
    @OneToMany
    @JoinColumn(name="id_detalle_pedido")
    private List<DetallePedido> detallePedido;

    @ManyToOne
    @JoinColumn(name = "id_comprobante")
    private Comprobante comprobante;

    @PrePersist
    protected void onPersist() {
        fechaPedido = new Date(System.currentTimeMillis());
    }


}
