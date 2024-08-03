package com.api_viaje.crud.Controllers.autos;

import com.api_viaje.crud.Models.Marca;
import com.api_viaje.crud.Services.autos.AutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/autos")
public class AutosController {
    @Autowired
    private AutosService autosService;

    @GetMapping("/getAll")
    public List<Marca> getAll(){
        return autosService.getAllMarcas();
    }

}
