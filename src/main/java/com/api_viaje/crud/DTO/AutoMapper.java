package com.api_viaje.crud.DTO;

import com.api_viaje.crud.Models.Auto;

import java.util.List;
import java.util.stream.Collectors;

public class AutoMapper {
    public static AutoDTO toDTO(Auto auto) {
        return new AutoDTO(
                auto.getId_auto(),
                auto.getFoto(),
                auto.getNumero_patente(),
                auto.getColor(),
                auto.getModelo().getNombre(),
                auto.getModelo().getMarca().getNombre()
        );
    }

    public static List<AutoDTO> toDTOList(List<Auto> autos) {
        return autos.stream().map(AutoMapper::toDTO).collect(Collectors.toList());
    }
}
