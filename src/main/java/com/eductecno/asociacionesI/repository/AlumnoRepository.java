package com.eductecno.asociacionesI.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eductecno.asociacionesI.model.Alumno;
@Repository
public interface AlumnoRepository extends CrudRepository<Alumno, Integer> {
	
	
}
