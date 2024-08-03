package com.api_viaje.crud.Models;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_marca;

    @Column(unique = true)
    private String nombre;

    @OneToMany(mappedBy = "marca", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Modelo> modelos;

}

