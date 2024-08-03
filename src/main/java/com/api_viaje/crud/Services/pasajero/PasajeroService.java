package com.api_viaje.crud.Services.pasajero;

import com.api_viaje.crud.Models.Pasajero;
import com.api_viaje.crud.Repositories.pasajero.IPasajeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasajeroService {

    @Autowired
    private IPasajeroRepository pasajeroRepository;

    public List<Pasajero> findAllPasajeros(){
        return pasajeroRepository.findAll();
    }
}
