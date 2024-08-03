package com.api_viaje.crud.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_auto;

    @ManyToOne
    @JoinColumn(name = "id_conductor")
    @JsonIgnore
    private Conductor conductor;

    @ManyToOne
    @JoinColumn(name = "id_modelo")
    private Modelo modelo;

    private String foto;
    @Column(unique = true)
    private String numero_patente;
    private String color;
}

