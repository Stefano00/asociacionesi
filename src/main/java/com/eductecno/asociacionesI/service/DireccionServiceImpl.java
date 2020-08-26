package com.eductecno.asociacionesI.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eductecno.asociacionesI.model.Direccion;
import com.eductecno.asociacionesI.repository.DireccionRepository;

@Service
public class DireccionServiceImpl implements DireccionService {

	@Autowired
	DireccionRepository direccionRepository;
	
	@Override
	public void save(Direccion direccion) {
	direccionRepository.save(direccion);

	}

	@Override
	public List<Direccion> findAll() {
		List<Direccion> directionList = new ArrayList<Direccion>();
		directionList=(List<Direccion>) direccionRepository.findAll();
		return directionList;

	}

}
