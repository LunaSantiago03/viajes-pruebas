package com.api_viaje.crud.Controllers.Conductor;


import com.api_viaje.crud.DTO.AutoDTO;
import com.api_viaje.crud.DTO.AutoMapper;
import com.api_viaje.crud.DTO.ConductorDTO;
import com.api_viaje.crud.Models.Conductor;
import com.api_viaje.crud.Services.conductor.ConductorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/conductores")
public class ConductorController {

    @Autowired
    private ConductorService conductorService;

    @GetMapping("/get")
    public List<ConductorDTO> getAll(){
        List<Conductor> conductores = conductorService.findAllConductores();
        return conductores.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private ConductorDTO convertToDTO(Conductor conductor) {
        List<AutoDTO> autosDTO = AutoMapper.toDTOList(conductor.getAutos());
        return new ConductorDTO(
                conductor.getId_conductor(),
                conductor.getNombre(),
                conductor.getApellido(),
                conductor.getCiudad(),
                conductor.getTelefono(),
                conductor.getPuntuacion(),
                conductor.getFoto(),
                autosDTO,
                conductor.getViajeDetalles()
        );
    }
}
