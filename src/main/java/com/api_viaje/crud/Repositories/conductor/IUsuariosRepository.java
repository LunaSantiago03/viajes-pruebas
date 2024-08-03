package com.api_viaje.crud.Repositories.conductor;

import com.api_viaje.crud.Models.Conductor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuariosRepository extends JpaRepository<Conductor,Integer> {
}
