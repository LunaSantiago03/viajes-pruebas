package com.api_viaje.crud.Repositories.pasajero;

import com.api_viaje.crud.Models.Viaje;
import com.api_viaje.crud.Models.ViajeDetalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IViajeDetalleRepository extends JpaRepository<ViajeDetalle,Integer> {
}
