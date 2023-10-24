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

    @GetMapping (value = "/get")
    public List<Alumno> obtenerAlumnos() {
        return alumnoService.obtenerAlumnos();
    }

    @PostMapping (value = "/insert")
    public Response insertarAlumno(@RequestBody List<Alumno> alumnos) {
        return alumnoService.insertarAlumno(alumnos);
    }

}