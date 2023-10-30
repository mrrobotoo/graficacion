package mx.com.cuh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.com.cuh.entity.ApiTienda;
import mx.com.cuh.pojo.Response;
import mx.com.cuh.service.Tienda;

@RestController
@RequestMapping(value = "/ApiTienda")
public class SegundoControlador {
	
	@Autowired
	private Tienda tienda;
	
	@PutMapping(value="/tienda")
	public Response updateTienda(@RequestBody ApiTienda apiTienda, @RequestParam(name = "Producto") String Codigo ) {
		return tienda.updateTienda(apiTienda, Codigo);
	}
	
	@DeleteMapping(value="/Producto")
	public Response deleteTienda( @RequestParam(name = "Nombre") String Nombre ) throws Exception {
		return tienda.deleteTienda(Nombre);
	}
}
