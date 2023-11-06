package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Base implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Column(name = "fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp fechaAlta;
    private Date fechaBaja;
    private Timestamp fechaModificacion;


    @PrePersist
    protected void onCreate() {
        fechaModificacion = new Timestamp(new Date().getTime());
    }

    @PreUpdate
    protected void onUpdate() {
        fechaModificacion = new Timestamp(new Date().getTime());
    }

    @PreRemove
    protected void onRemove() {
        fechaBaja = new Timestamp(new Date().getTime());
    }
}
