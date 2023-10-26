package mx.com.cuh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.cuh.entity.FormulaEntity;
import mx.com.cuh.pojo.Response;
import mx.com.cuh.repository.FormulaRepository;

@Service
public class FormulaServiceImpl implements FormulaService {
	@Autowired
	private FormulaRepository formulaRepository;

	@Override
	public List<FormulaEntity> obtenerDatos() {
		return (List<FormulaEntity>) formulaRepository.findAll();
	}

	@Override
	public Response insertarDatos(List<FormulaEntity> corredores) {
		//List<Tuple> corredor = formulaRepository.obtenerDatos();
		Response mensaje = new Response();
		
		for(FormulaEntity corredor2 : corredores) {
			formulaRepository.save(corredor2);
		}
		
		mensaje.setMensaje("Insertado correctamente");
		return mensaje;
	}

	@Override
	public Response eliminarDatos(FormulaEntity corredores, Integer id) {
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
	@Override
	public Response actualizarDatos(FormulaEntity corredores, Integer id) {
		Optional<FormulaEntity> corredorFind = formulaRepository.findById(corredores.getId());
		Response respuesta = new Response();
	
		if (corredorFind.isPresent()) {
			FormulaEntity corredorFormula = new FormulaEntity();
			corredorFormula = corredorFind.get();
			corredorFormula.setNombre(corredores.getNombre());
			corredorFormula.setEquipo(corredores.getEquipo());
			corredorFormula.setNacionalidad(corredores.getNacionalidad());
			corredorFormula.setEdad(corredores.getEdad());
			formulaRepository.save(corredorFormula);
			respuesta.setMensaje("El corredor fue actualizado de manera exitosa");
		}else {
			respuesta.setMensaje("No existe registro del corredor");
		}
		return respuesta;
	}
	@Override
	public Optional<FormulaEntity> buscarId(Integer id) {
        return (Optional<FormulaEntity>) formulaRepository.findById(id);
    }

}
