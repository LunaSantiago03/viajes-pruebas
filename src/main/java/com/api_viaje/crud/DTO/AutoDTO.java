package com.api_viaje.crud.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AutoDTO {
    private int idAuto;
    private String foto;
    private String numeroPatente;
    private String color;
    private String modelo;
    private String marca;
}
