package com.api_viaje.crud.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class ViajesDPDTO {
    private String conductorNombre;
    private String conductorApellido;
    private String conductorFoto;
    private String salida;
    private String entrada;
    private Date fecha;
    private String hora;
    private int precio;
    private int asientos;
    private int asientosDisponibles;
    private String autoMarca;
    private String autoModelo;
    private String autoFoto;
    private String autoPatente;
    private List<String> fotosPasajeros;
}
