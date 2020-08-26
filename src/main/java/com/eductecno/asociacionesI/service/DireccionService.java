package com.eductecno.asociacionesI.service;

import java.util.List;

import com.eductecno.asociacionesI.model.Direccion;

public interface DireccionService {
	public void save(Direccion direccion);
	public List<Direccion> findAll();
}
