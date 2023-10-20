package mx.com.cuh.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.com.cuh.entity.Autor;
import mx.com.cuh.pojo.Alumnos;

@RestController
@RequestMapping(value="/formula")
public class FormulaController {
	@GetMapping(value="/corredores")
	public List<Autor> obtenerAutor(){
		return alumno.obtenerAutor();
	}

}
