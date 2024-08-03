package com.api_viaje.crud.Repositories.pasajero;

import com.api_viaje.crud.Models.Pasajero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPasajeroRepository extends JpaRepository<Pasajero,Integer> {
}
