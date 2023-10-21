package mx.com.cuh.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.persistence.Tuple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.cuh.pojo.Response;
import mx.com.cuh.entity.Alumno;
import mx.com.cuh.pojo.AlumnoRequest;

import mx.com.cuh.repository.AlumnoRepository;



@Service
public class AlumnoImpl implements AlumnoService {

	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@Override
	public List<Alumno> obtenerAlumnos() {
		return (List<Alumno>) alumnoRepository.findAll();
	}

	@Override
	public Response insertarAlumno(List<Alumno> autor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response updateAlumno(Alumno alumno, String matricula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response deleteAlumno(String matricula) {
		// TODO Auto-generated method stub
		return null;
	}

	
}