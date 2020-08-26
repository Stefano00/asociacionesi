package com.eductecno.asociacionesI.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eductecno.asociacionesI.model.Direccion;
import com.eductecno.asociacionesI.service.DireccionService;

@Controller
@RequestMapping("/direcciones")
public class DireccionController {

	@Autowired
	DireccionService direccionService;
	
	@GetMapping("/")
	public String crear(Model model) {
		List<Direccion> directionList = new ArrayList<Direccion>();
		directionList=direccionService.findAll();
		for(Direccion list: directionList) {
			System.out.println(list.toString());
		}
		model.addAttribute("directionlist", directionList);
		
		return "direcciones";
	}
	
	@PostMapping("/")
	public String crearPost() {
		
		return null;
	}
	
	@GetMapping("/crear")
	public String direccionesGet() {
		
		return "crear-direccion";
	}

	@PostMapping("/crear")
	public String direcciones(@ModelAttribute Direccion direccion) {
		//System.out.println(direccion.toString());
		direccionService.save(direccion);
		
		return "crear-direccion";
	}
}
