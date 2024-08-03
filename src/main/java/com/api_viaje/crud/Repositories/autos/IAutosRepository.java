package com.api_viaje.crud.Repositories.autos;

import com.api_viaje.crud.Models.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAutosRepository extends JpaRepository<Marca,Integer> {
}
