package mx.com.cuh.service;

import java.util.List;

import mx.com.cuh.entity.ApiTienda;
import mx.com.cuh.pojo.Productos;
import mx.com.cuh.pojo.Response;

public interface Tienda {
	
	List<Productos> obtenerProductos();
	List<ApiTienda> obtenerTienda();
	Response insertarTienda(List<ApiTienda> Tienda);
	Response updateTienda(ApiTienda ApiTienda, String fin);
	Response deleteTienda(String fin) throws Exception;
}
