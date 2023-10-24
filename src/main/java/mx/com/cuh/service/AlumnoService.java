package mx.com.cuh.service;

import java.util.List;

import mx.com.cuh.entity.Alumno;
import mx.com.cuh.pojo.Response;

public interface AlumnoService {
	
	List<Alumno> obtenerAlumnos();
	Response insertarAlumno(List<Alumno> alumno);
	Response updateAlumno(Alumno alumno, Long matricula);
	Response deleteAlumno(Long matricula) throws Exception;
}
