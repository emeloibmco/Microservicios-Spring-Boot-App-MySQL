package com.microservicios.app.transacciones.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.microservicios.commons.transacciones.models.entity.Persona;

public interface PersonaRepository extends CrudRepository<Persona, Long> {

}
