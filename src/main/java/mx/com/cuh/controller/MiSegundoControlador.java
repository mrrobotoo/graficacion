package mx.com.cuh.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.com.cuh.entity.Autor;
import mx.com.cuh.pojo.Alumnos;
import mx.com.cuh.pojo.Response;
import mx.com.cuh.service.Alumno;
/*


@RestController
@RequestMapping(value = "/portalalumno")
public class MiSegundoControlador {
	
	@Autowired
	private Alumno alumno;
	
	
	
	@PutMapping(value="/alumnos")
	public Response updateAlumno(@RequestBody Autor autor, @RequestParam(name = "matricula") String matricula ) {
		return alumno.updateAutor(autor, matricula);
	}
	@DeleteMapping(value="/alumnos")
	public Response deleteAlumno(@RequestBody Autor autor, @RequestParam(name = "matricula") String matricula ) {
		return alumno.deleteAutor(matricula);
	}
}
*/