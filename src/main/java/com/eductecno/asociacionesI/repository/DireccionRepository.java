package com.eductecno.asociacionesI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eductecno.asociacionesI.model.Direccion;

@Repository
public interface DireccionRepository extends CrudRepository<Direccion, Integer>{

}
