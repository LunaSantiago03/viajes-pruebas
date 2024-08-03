package com.api_viaje.crud.Controllers.pasajero;


import com.api_viaje.crud.Models.Pasajero;
import com.api_viaje.crud.Services.pasajero.PasajeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pasajeros")
public class PasajeroController {

    @Autowired
    private PasajeroService pasajeroService;

    @GetMapping("/getAll")
    public List<Pasajero> findAll(){
        return pasajeroService.findAllPasajeros();
    }
}
