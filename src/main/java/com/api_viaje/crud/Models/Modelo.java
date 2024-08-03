package com.api_viaje.crud.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Modelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_modelo;

    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_marca")
    @JsonIgnore
    private Marca marca;
}


