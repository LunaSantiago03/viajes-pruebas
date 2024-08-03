package com.api_viaje.crud.Models;

import com.api_viaje.crud.Enums.Ciudad;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ViajeDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_viaje_detalle;

    @Enumerated(EnumType.STRING)
    private Ciudad salida;

    @Enumerated(EnumType.STRING)
    private Ciudad entrada;

    private String hora;
    private Date fecha;
    private Integer precio;
    private Integer asientos;

    @ManyToOne
    @JoinColumn(name = "id_auto")
    private Auto auto;

    @ManyToOne
    @JoinColumn(name = "id_conductor")
    private Conductor conductor;

    /* @OneToMany(mappedBy = "viaje_detalle")
    private List<Viaje> viajes; */
}

