package mx.com.cuh.service;

import java.util.List;

import mx.com.cuh.entity.Autor;
import mx.com.cuh.pojo.Alumnos;

public interface Alumno {
	
	List<Alumnos> obtenerAlumnos();
	List<Autor> obtenerAutor();
}
