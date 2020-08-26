package com.eductecno.asociacionesI.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eductecno.asociacionesI.model.Alumno;
import com.eductecno.asociacionesI.model.Direccion;
import com.eductecno.asociacionesI.service.AlumnoService;
import com.eductecno.asociacionesI.service.DireccionService;

@Controller
@RequestMapping("/alumnos")
public class AlumnoController {
	
	@Autowired
	AlumnoService alumnoService;
	
	@Autowired
	DireccionService direccionService;
	
	@GetMapping("/")
	public String listar(Model model) {
		List<Alumno> listaAlumno = new ArrayList<Alumno>();
		listaAlumno=alumnoService.findAll();
		for(Alumno list: listaAlumno) {
			System.out.println(list.toString());
		}
		
		model.addAttribute("listaAlumnos",listaAlumno);
		return "alumnos";
	}
	
	
	@GetMapping("/crear")
	public String alumnos(Model model) {
		model.addAttribute("listaDirecciones", direccionService.findAll());
		return "crear-alumno";
	}
	
	@PostMapping("/crear")
	public String alumnosPost(@ModelAttribute Alumno alumno, Model model) {
		model.addAttribute("listaDirecciones", direccionService.findAll());
		System.out.println(alumno.getDireccion().toString());
		alumnoService.save(alumno);
		return "crear-alumno";
	}

}
