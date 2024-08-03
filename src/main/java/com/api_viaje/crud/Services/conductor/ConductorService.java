package com.api_viaje.crud.Services.conductor;


import com.api_viaje.crud.Models.Conductor;
import com.api_viaje.crud.Repositories.conductor.IConductorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConductorService {

    @Autowired
    private IConductorRepository iConductorRepository;

    public List<Conductor> findAllConductores(){
        return iConductorRepository.findAll();
    }

}
