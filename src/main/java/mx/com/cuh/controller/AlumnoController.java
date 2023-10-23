package mx.com.cuh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import mx.com.cuh.entity.Alumno;
import mx.com.cuh.pojo.Response;
import mx.com.cuh.service.AlumnoService;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @GetMapping
    public List<Alumno> obtenerAlumnos() {
        return alumnoService.obtenerAlumnos();
    }

    @PostMapping
    public Response insertarAlumno(@RequestBody List<Alumno> alumnos) {
        return alumnoService.insertarAlumno(alumnos);
    }

    @PutMapping("/{matricula}")
    public Response updateAlumno(@RequestBody Alumno alumno, @PathVariable String matricula) {
        return alumnoService.updateAlumno(alumno, matricula);
    }

    @DeleteMapping("/{matricula}")
    public Response deleteAlumno(@PathVariable String matricula) {
        return alumnoService.deleteAlumno(matricula);
    }
}