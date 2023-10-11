package mx.com.cuh.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.cuh.entity.Autor;
import mx.com.cuh.pojo.Alumnos;
import mx.com.cuh.pojo.Response;
import mx.com.cuh.repository.AutorRepository;

@Service
public class AlumnoImpl implements Alumno {

	@Autowired
	private AutorRepository autorRepository;
	
	@Override
	public List<Alumnos> obtenerAlumnos() {
		List<Alumnos> listaAlumnos = new ArrayList<>();
		
		Alumnos alumno1 = new Alumnos();
		alumno1.setMatricula("CUH51197627");
		alumno1.setNombre("ARMAS AVILA JESUS ENRIQUE");
		
		Alumnos alumno2 = new Alumnos();
		alumno2.setMatricula("CUH51218556");
		alumno2.setNombre("DAVIS MONTIEL KEVIN ANTONIO");
		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		return listaAlumnos;
	}

	@Override
	public List<Autor> obtenerAutor() {
		return (List<Autor>) autorRepository.findAll();
	}

	@Override
	public Response insertarAutor(List<Autor> autor) {
		Response respuesta = new Response();
		
		for (Autor autor2 : autor) {
			autorRepository.save(autor2);
		}
		
		respuesta.setMensaje("todo ok");
		return respuesta;
	}

}
