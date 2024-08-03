package com.api_viaje.crud.Services.autos;

import com.api_viaje.crud.Models.Marca;
import com.api_viaje.crud.Repositories.autos.IAutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutosService {
    @Autowired
    private IAutosRepository autosRepository;

    public List<Marca> getAllMarcas(){
        return autosRepository.findAll();
    }

}
