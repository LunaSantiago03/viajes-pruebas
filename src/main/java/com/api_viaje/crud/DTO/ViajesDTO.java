package com.api_viaje.crud.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class ViajesDTO {
    private int idViaje;
    private String conductorNombre;
    private String conductorApellido;
    private String conductorFoto;
    private String salida;
    private String entrada;
    private Date fecha;
    private String hora;
    private int precio;
    private int asientos;
    private String autoMarca;
    private String autoModelo;
    private String autoFoto;
    private String autoPatente;
    private List<PasajeroDTO> pasajeros;
}
