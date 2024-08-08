package com.api_viaje.crud.Controllers.viajes;


import com.api_viaje.crud.DTO.ViajesDTO;
import com.api_viaje.crud.Services.viajes.ViajesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/viajes")
public class ViajesController {
    @Autowired
    private ViajesService service;

    @GetMapping("/getAll")
    public List<ViajesDTO> getAll(){
        return service.getAll();
    }

    @GetMapping("/getById/{id_viaje_detalle}")
    public ResponseEntity<ViajesDTO> getById(@PathVariable Integer id_viaje_detalle) {
        ViajesDTO v = this.service.getViajeDTOById(id_viaje_detalle);
        if(v != null){
            return ResponseEntity.ok(v);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("getDisponibles")
    public List<ViajesDTO> getDisponibles(){
        return service.getAllViajeDetalles();
    }

}
