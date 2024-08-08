package com.api_viaje.crud.Models;

import com.api_viaje.crud.Enums.Ciudad;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pasajero")
public class Pasajero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPasajero;

    private String nombre;
    private String apellido;

    @Enumerated(EnumType.STRING)
    private Ciudad ciudad;

    private String telefono;
    private String foto;

    @OneToMany(mappedBy = "pasajero", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    //@JsonManagedReference
    private List<Viaje> viajes;
}


