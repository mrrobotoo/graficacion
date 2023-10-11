package mx.com.cuh.service;

import java.util.List;

import mx.com.cuh.entity.Autor;
import mx.com.cuh.pojo.Alumnos;
import mx.com.cuh.pojo.Response;

public interface Alumno {
	
	List<Alumnos> obtenerAlumnos();
	List<Autor> obtenerAutor();
	Response insertarAutor(List<Autor> autor);
}
