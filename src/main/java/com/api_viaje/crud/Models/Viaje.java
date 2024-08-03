package com.api_viaje.crud.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

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
    private ViajeDetalle viaje_detalle;

    @ManyToOne
    @JoinColumn(name = "id_pasajero")
    @JsonIgnore
    private Pasajero pasajero;
}
