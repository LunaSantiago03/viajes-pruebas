package com.api_viaje.crud.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "viaje")
public class Viaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_viaje;

    @ManyToOne
    @JoinColumn(name = "id_viaje_detalle")
    @JsonIgnore
    private ViajeDetalle viaje_detalle;

    @ManyToOne
    @JoinColumn(name = "id_pasajero")
    @JsonBackReference
    private Pasajero pasajero;
}
