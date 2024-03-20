package com.gmdual.gmctpbkd.usuarios;

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
public class Usuarios {
    @Id
    @GeneratedValue
    private Integer id;
    @Basic
    private String nombre;
    private String apellidos;
    private String correo_electronico;
    private String rol;
    private String fecha_de_registro;
    private String fecha_de_cambio_de_contraseña;
    private String fecha_de_baja;
    private String hash_de_contraseña;
    private String token_de_seguridad;
    private String fecha_de_vigencia_de_token;
}
