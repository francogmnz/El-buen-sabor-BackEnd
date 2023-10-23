package com.example.demo.entities;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Comprobante  extends Base{
    private  String nombreComprobante;
    private int numeroComprobante;
    private Date fechaFacturacionComprobante;

}
