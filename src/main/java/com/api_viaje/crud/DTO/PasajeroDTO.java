package com.api_viaje.crud.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PasajeroDTO {
    private int idPasajero;
    private String nombre;
    private String apellido;
    private String foto;
}
