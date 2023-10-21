package mx.com.cuh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mx.com.cuh.entity.Alumno;
import mx.com.cuh.entity.Colegiatura;
import mx.com.cuh.pojo.Response;
import mx.com.cuh.repository.AlumnoRepository;
import mx.com.cuh.repository.ColegiaturaRepository;

public class ColegiaturaImpl implements ColegiaturaService{
	@Autowired
    private ColegiaturaRepository colegiaturaRepository;

    @Autowired
    private AlumnoRepository alumnoRepository;

    
	@Override
	public List<Colegiatura> obtenerColegiaturas() {
		return (List<Colegiatura>) colegiaturaRepository.findAll();
		// TODO Auto-generated method stub
	}

	@Override
	public Response insertarColegiatura(Colegiatura colegiatura) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response updateColegiatura(Colegiatura colegiatura, Long colegiaturaId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response deleteColegiatura(Long colegiaturaId) {
		// TODO Auto-generated method stub
		return null;
	}
}
