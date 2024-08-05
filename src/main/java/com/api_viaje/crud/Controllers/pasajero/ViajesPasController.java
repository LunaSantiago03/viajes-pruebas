package com.api_viaje.crud.Controllers.pasajero;


import com.api_viaje.crud.DTO.ViajesDTO;
import com.api_viaje.crud.Models.Viaje;
import com.api_viaje.crud.Models.ViajeDetalle;
import com.api_viaje.crud.Models.ViajesDPDTO;
import com.api_viaje.crud.Services.pasajero.ViajesPasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pasajero/viajes")
public class ViajesPasController {
    @Autowired
    private ViajesPasService service;

    @GetMapping("getAll")
    public List<ViajesDTO> getAll(){
        return service.getAllViajeDetalles();
    }

}
