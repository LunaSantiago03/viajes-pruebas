package com.api_viaje.crud.Controllers.Conductor;


import com.api_viaje.crud.Models.Conductor;
import com.api_viaje.crud.Services.conductor.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/conductores")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/get")
    public List<Conductor> getAll(){
        return this.usuarioService.findAllConductores();
    }
}
