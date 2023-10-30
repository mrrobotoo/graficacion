package mx.com.cuh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.cuh.entity.ApiTienda;
import mx.com.cuh.pojo.Productos;
import mx.com.cuh.pojo.Response;
import mx.com.cuh.service.Tienda;

@RestController
@RequestMapping(value = "/Productos")
public class PrimerControlador {
	
	@Autowired
	private Tienda tienda;
	
	@GetMapping(value="/CargaTienda" )
	public List<Productos> obtenerProductos() {
		return tienda.obtenerProductos();
	}
	
	@GetMapping(value="/Producto")
	public List<ApiTienda> obtenerTienda(){
		return tienda.obtenerTienda();
	}
	
	@PostMapping(value="/Producto")
	public Response crearProducto(@RequestBody List<ApiTienda> Productos ) {
		return tienda.insertarTienda(Productos);
	}
}

