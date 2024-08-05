package com.api_viaje.crud.Services.pasajero;

import com.api_viaje.crud.DTO.PasajeroDTO;
import com.api_viaje.crud.DTO.ViajesDTO;
import com.api_viaje.crud.Models.*;
import com.api_viaje.crud.Repositories.pasajero.IViajeDetalleRepository;
import com.api_viaje.crud.Repositories.pasajero.IViajesPasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ViajesPasService {
    @Autowired
    private IViajeDetalleRepository viajeDetalleRepository;

    @Autowired
    private IViajesPasRepository viajeRepository;

    public List<ViajesDTO> getAllViajeDetalles() {
        List<ViajeDetalle> viajesDetalle = viajeDetalleRepository.findAll();
        List<ViajesDTO> viajeDetalleDTOs = new ArrayList<>();

        for (ViajeDetalle viajeDetalle : viajesDetalle) {
            // Recupere el conductor, el auto
            Conductor conductor = viajeDetalle.getConductor();
            Auto auto = viajeDetalle.getAuto();

            // Obtener todos los viajes para el viaje_detalle específico
            List<Viaje> viajes = viajeRepository.findByViajeDetalleIdViajeDetalle(viajeDetalle.getId_viaje_detalle());

            List<PasajeroDTO> pasajerosDTO = new ArrayList<>();

            for (Viaje viaje : viajes) {
                Pasajero pasajero = viaje.getPasajero();
                PasajeroDTO pasajeroDTO = new PasajeroDTO(
                        pasajero.getIdPasajero(),
                        pasajero.getNombre(),
                        pasajero.getApellido(),
                        pasajero.getFoto()
                );
                pasajerosDTO.add(pasajeroDTO);
            }

            ViajesDTO dto = new ViajesDTO(
                    viajeDetalle.getId_viaje_detalle(),
                    conductor.getNombre(),
                    conductor.getApellido(),
                    conductor.getFoto(),
                    viajeDetalle.getSalida().name(),
                    viajeDetalle.getEntrada().name(),
                    viajeDetalle.getFecha(),
                    viajeDetalle.getHora(),
                    viajeDetalle.getPrecio(),
                    viajeDetalle.getAsientos(),
                    auto.getModelo().getMarca().getNombre(),
                    auto.getModelo().getNombre(),
                    auto.getFoto(),
                    auto.getNumero_patente(),
                    pasajerosDTO
            );

            // Agregar el DTO a la lista final
            viajeDetalleDTOs.add(dto);
        }

        return viajeDetalleDTOs;
    }

}
