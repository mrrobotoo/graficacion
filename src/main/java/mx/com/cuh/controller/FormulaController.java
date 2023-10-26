package mx.com.cuh.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.com.cuh.entity.FormulaEntity;
import mx.com.cuh.pojo.Response;
import mx.com.cuh.service.FormulaService;

@RestController
@RequestMapping(value="/formula")
public class FormulaController {
	@Autowired
	private FormulaService corredor;
	
	@GetMapping(value="/corredores")
	public List<FormulaEntity> obtenerDatos(){
		return corredor.obtenerDatos();
	}
	
	@PostMapping(value="/corredores")
	public Response insertarDatos(@RequestBody List<FormulaEntity> corredores ) {
		return corredor.insertarDatos(corredores);
	}
	
	@DeleteMapping(value="/corredores")
	public Response eliminarDatos(@RequestBody FormulaEntity corredores, @RequestParam(name = "id") Integer id ) {
		return corredor.eliminarDatos(corredores, id);
	}
	@PutMapping(value="/corredores")
	public Response actualizarDatos(@RequestBody FormulaEntity corredores, @RequestParam(name = "id") Integer id) {
		return corredor.actualizarDatos(corredores, id);
	}
	@GetMapping (value="/corredor")
	public Optional<FormulaEntity> buscarId(@RequestParam(name="id") Integer id){
		return corredor.buscarId(id);
	}

}
