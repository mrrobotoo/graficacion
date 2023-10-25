package mx.com.cuh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import mx.com.cuh.entity.Alumno;
import mx.com.cuh.pojo.Response;
import mx.com.cuh.service.AlumnoService;


@RestController
@RequestMapping(value = "/colegiatura")
public class ColegiaturaController {
	
	@Autowired
	private AlumnoService alumno;
	
	
	 @PutMapping(value = "/update")
	    public Response updateAlumno(@RequestBody Alumno alumnoActualizado, @RequestParam(name = "matricula") Long matricula) {
	        return alumno.updateAlumno(alumnoActualizado, matricula);

	    	}
	     
	    @DeleteMapping(value="/delete")	
		public Response deleteAlumno( @RequestParam(name = "matricula") Long matricula ) throws Exception {
			return alumno.deleteAlumno(matricula);
		}
}
