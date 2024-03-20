package com.gmdual.gmctpbkd.puntosinspeccion;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PuntosInspeccion {
    @Id
    @GeneratedValue
    private Integer id;
    @Basic
    private Integer secuencia;
    private String nombre;
    private String descripcion;
    private String fecha_de_creacion;
    private String fecha_de_baja;
}
