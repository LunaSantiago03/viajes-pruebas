package com.api_viaje.crud.Repositories.pasajero;


import com.api_viaje.crud.Models.Viaje;
import com.api_viaje.crud.Models.ViajeDetalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IViajesPasRepository extends JpaRepository<Viaje, Integer> {
    @Query(value = "SELECT * FROM viaje WHERE id_viaje_detalle = :idViajeDetalle", nativeQuery = true)
    List<Viaje> findByViajeDetalleIdViajeDetalle(@Param("idViajeDetalle") int idViajeDetalle);
}

