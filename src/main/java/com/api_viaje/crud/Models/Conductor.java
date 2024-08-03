package com.api_viaje.crud.Models;

import com.api_viaje.crud.Enums.Ciudad;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "conductor")
public class Conductor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_conductor")  // Asegurar coincidencia con la base de datos
    private int id_conductor;

    @Column(name = "nombre")  // Asegurar coincidencia con la base de datos
    private String nombre;

    @Column(name = "apellido")  // Asegurar coincidencia con la base de datos
    private String apellido;

    @Enumerated(EnumType.STRING)
    @Column(name = "ciudad")  // Asegurar coincidencia con la base de datos
    private Ciudad ciudad;

    @Column(name = "telefono")  // Asegurar coincidencia con la base de datos
    private String telefono;

    @Column(name = "puntuacion")  // Asegurar coincidencia con la base de datos
    private float puntuacion;

    @Column(name = "foto")  // Asegurar coincidencia con la base de datos
    private String foto;
}


