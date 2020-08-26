package com.eductecno.asociacionesI.service;

import java.util.List;

import com.eductecno.asociacionesI.model.Alumno;

public interface AlumnoService {
	public void save(Alumno alumno);
	public List<Alumno> findAll();
}
