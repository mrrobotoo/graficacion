package mx.com.cuh.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.Tuple;

import org.springframework.beans.factory.annotation.Autowired;

import mx.com.cuh.entity.FormulaEntity;
import mx.com.cuh.pojo.Response;
import mx.com.cuh.repository.FormulaRepository;

public class FormulaServiceImpl implements FormulaService {
	@Autowired
	private FormulaRepository formulaRepository;

	@Override
	public List<FormulaEntity> obtenerDatos() {
		return (List<FormulaEntity>) formulaRepository.findAll();
	}

	@Override
	public Response insertarDatos(List<FormulaEntity> corredores) {
		List<Tuple> listado = formulaRepository.obtenerDatos();
		Response mensaje = new Response();
		
		for(FormulaEntity corredor2 : corredores) {
			formulaRepository.save(corredor2);
		}
		
		mensaje.setMensaje("Insertado correctamente");
		return mensaje;
	}

	@Override
	public Response eliminarDatos(FormulaEntity corredores, int id) {
		Optional<FormulaEntity> corredorFind =formulaRepository.findById(corredores.getId());
		Response respuesta = new Response();
	
		if (corredorFind.isPresent()) {
			FormulaEntity corredorFormula = new FormulaEntity();
			corredorFormula = corredorFind.get();
			corredorFormula.setNombre(corredores.getNombre());
			formulaRepository.delete(corredorFormula);
			respuesta.setMensaje("El corredor se elimino de manera exitosa");
		}else {
			respuesta.setMensaje("El corredor no existe en nuestra base de datos");
		}
		return respuesta;
	}

}
