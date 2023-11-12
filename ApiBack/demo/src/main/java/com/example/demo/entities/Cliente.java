package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Cliente")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Cliente extends Base {

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "email")
    private String email;

    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id_domicilio")
    private List<Domicilio> domicilios = new ArrayList<Domicilio>();

    @OneToMany (cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn (name = "id_pedido")
    private List<Pedido> pedidos = new ArrayList<Pedido>();

}
