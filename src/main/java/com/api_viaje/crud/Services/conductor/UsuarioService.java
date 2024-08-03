package com.api_viaje.crud.Services.conductor;


import com.api_viaje.crud.Models.Conductor;
import com.api_viaje.crud.Repositories.conductor.IUsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private IUsuariosRepository iUsuariosRepository;

    public List<Conductor> findAllConductores(){
        return iUsuariosRepository.findAll();
    }

}
