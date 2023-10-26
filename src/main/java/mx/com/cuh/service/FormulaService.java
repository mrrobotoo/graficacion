package mx.com.cuh.service;

import java.util.List;
import java.util.Optional;

import mx.com.cuh.entity.FormulaEntity;
import mx.com.cuh.pojo.Response;

public interface FormulaService {
	List<FormulaEntity> obtenerDatos();
	Response insertarDatos(List<FormulaEntity> corredores);
	Response eliminarDatos(FormulaEntity corredores, Integer id);
	Response actualizarDatos(FormulaEntity corredores, Integer id);
	Optional<FormulaEntity> buscarId(Integer id);
}
