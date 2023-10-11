package mx.com.cuh.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.com.cuh.entity.Autor;
import mx.com.cuh.pojo.Alumnos;
import mx.com.cuh.service.Alumno;



@RestController
@RequestMapping(value = "/portaldocente")
public class MiPrimerControlador {
	
	@Autowired
	private Alumno alumno;
	
	@GetMapping(value="/cargaacademica-alumnos" )
	public List<Alumnos> metodoGet(@RequestParam(name = "grupo") String cosa) {

		return alumno.obtenerAlumnos();
	}
	
	@GetMapping(value="/autor")
	public List<Autor> obtenerAutor(){
		return alumno.obtenerAutor();
	}
	
	@PostMapping(value="/autor")
	public void crearAlumno(@RequestBody Alumnos alumno ) {
		System.out.println("hola");
	}
}
