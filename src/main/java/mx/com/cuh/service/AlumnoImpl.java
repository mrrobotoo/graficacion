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
	public Response insertarAlumno(List<Alumno> alumno) {
		Response respuesta = new Response();

        try {
            // Insertar cada alumno en la base de datos
            for (Alumno alumno1 : alumno) {
                alumnoRepository.save(alumno1);
            }

            respuesta.setMensaje("Alumnos insertados correctamente");
        } catch (Exception e) {
            respuesta.setMensaje("Error al insertar alumnos: " + e.getMessage());
        }

        return respuesta;
	}

	@Override
	public Response updateAlumno(Alumno alumno, Long matricula) {
	    Response respuesta = new Response();
	    Optional<Alumno> alumnoExistente = alumnoRepository.findById(matricula);
	    if (alumnoExistente.isPresent()) {
	        Alumno alumnoActualizado = alumnoExistente.get();
	        alumnoActualizado.setNombre(alumno.getNombre()); 
	        alumnoActualizado.setAlumno(alumno.getAlumno());
	        alumnoActualizado.setMonto(alumno.getMonto());
	        alumnoActualizado.setFechaPago(alumno.getFechaPago());
	        alumnoRepository.save(alumnoActualizado);
	        respuesta.setMensaje("Alumno actualizado correctamente");
	    } else {
	        respuesta.setMensaje("Alumno no encontrado");
	    }

	    return respuesta;
	}

	@Override
	public Response deleteAlumno(Long matricula) throws Exception {
		Response respuesta = new Response();
		
        Optional<Alumno> alumnoExistente = alumnoRepository.findById(matricula);

        if (alumnoExistente.isPresent()) {

            alumnoRepository.delete(alumnoExistente.get());
            respuesta.setMensaje("Alumno eliminado correctamente");
        } else {
            respuesta.setMensaje("Alumno no encontrado");
        }

        return respuesta;
    }

	}

	