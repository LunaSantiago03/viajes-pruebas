package com.api_viaje.crud.Repositories.viajes;

import com.api_viaje.crud.Models.Viaje;
import com.api_viaje.crud.Models.ViajeDetalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IViajeDetalleRepository extends JpaRepository<ViajeDetalle,Integer> {

    @Query(value = "SELECT * FROM viaje_detalle WHERE id_viaje_detalle = :idViajeDetalle",nativeQuery = true)
    ViajeDetalle findViajeById(@Param("idViajeDetalle") int idViajeDetalle);
}
