package mx.com.cuh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.com.cuh.entity.Alumno;
import mx.com.cuh.pojo.Response;
import mx.com.cuh.repository.AlumnoRepository;



@Service

public class AlumnoImpl implements AlumnoService {

	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@Override
	public List<Alumno> obtenerAlumnos() {
		return (List<Alumno>) alumnoRepository.findAll();
	}
@Transactional
	@Override
	
	public Response insertarAlumno(List<Alumno> alumno) {
		//insertarAlumno(Long matricula, String alumno, String nombre, Double monto, Date fechaPago) {
		Response respuesta = new Response();
		try {
            
            for (Alumno alumno1 : alumno) {
              alumnoRepository.save(alumno1);
           }

            respuesta.setMensaje("Alumnos insertados correctamente");
        } catch (Exception e) {
            respuesta.setMensaje("Error al insertar alumnos: " + e.getMessage());
        }
		return respuesta;
		
}

      //  return respuesta;
      //  try {
      //      alumnoRepository.insertar(alumno);

      //      respuesta.setMensaje("Alumnos insertados correctamente");
      //  } catch (Exception e) {
     //       respuesta.setMensaje("Error al insertar alumnos: ");
     //   }

    //    return respuesta;
    //   }// try {
            // Insertar cada alumno en la base de datos
        //    for (Alumno alumno1 : alumno) {
        //        alumnoRepository.save(alumno1);
        //    }

        //    respuesta.setMensaje("Alumnos insertados correctamente");
      //  } catch (Exception e) {
       //     respuesta.setMensaje("Error al insertar alumnos: " + e.getMessage());
      //  }

      //  return respuesta;
	

	@Override
	public Response updateAlumno(Alumno alumno, Long matricula) {
	    Response respuesta = new Response();
	    Optional<Alumno> alumnoExistente = alumnoRepository.findById(matricula);
	    if (alumnoExistente.isPresent()) {
	        Alumno alumnoActualizado = alumnoExistente.get();
	        alumnoActualizado.setNombre(alumno.getNombre()); 
	        alumnoActualizado.setApellidos(alumno.getApellidos());
	        alumnoActualizado.setCalificacion(alumno.getCalificacion());
	        alumnoActualizado.setAdeudos(alumno.getAdeudos());
	        alumnoActualizado.setEstado(alumno.getEstado());
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

	