package com.api_viaje.crud.DTO;

import com.api_viaje.crud.DTO.AutoDTO;
import com.api_viaje.crud.Enums.Ciudad;
import com.api_viaje.crud.Models.ViajeDetalle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConductorDTO {
    private int idConductor;
    private String nombre;
    private String apellido;
    private Ciudad ciudad;
    private String telefono;
    private float puntuacion;
    private String foto;
    private List<AutoDTO> autos;
    private List<ViajeDetalle> viajeDetalles;

}
