package com.eductecno.asociacionesI.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eductecno.asociacionesI.model.Alumno;
import com.eductecno.asociacionesI.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService{

	@Autowired
	AlumnoRepository alumnoRepository;
	
	@Override
	public void save(Alumno alumno) {
		alumnoRepository.save(alumno);
	}

	@Override
	public List<Alumno> findAll() {
		List<Alumno> listaAlumno = new ArrayList<Alumno>();
		listaAlumno=(List<Alumno>) alumnoRepository.findAll();
		return listaAlumno;
	}



}
