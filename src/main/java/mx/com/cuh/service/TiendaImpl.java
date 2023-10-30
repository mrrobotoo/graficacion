package mx.com.cuh.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.Tuple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.cuh.entity.ApiTienda;
import mx.com.cuh.pojo.Productos;
import mx.com.cuh.pojo.Response;
import mx.com.cuh.repository.TiendaRepository;

@Service
public class TiendaImpl implements Tienda {

	@Autowired
	private TiendaRepository tiendaRepository;
	
	@Override
	public List<ApiTienda> obtenerTienda() {
		return (List<ApiTienda>) tiendaRepository.findAll();
	}

	@Override
	public Response insertarTienda(List<ApiTienda> tienda) {
		List<Tuple> producto = tiendaRepository.obtenervaloresTienda();
		Response respuesta = new Response();
		for (ApiTienda Product : tienda) {
			tiendaRepository.save(Product);
		}
		respuesta.setMensaje("El Producto se inserto correctamente ");
		return respuesta;
	}

	@Override
	public Response updateTienda(ApiTienda tienda, String Codigo) {
		Optional<ApiTienda> Productoencontado =tiendaRepository.findById(tienda.getCodigoProducto());
		Response respuesta = new Response();
	
			if (Productoencontado.isPresent()) {
				
				ApiTienda Producto = Productoencontado.get();
				Producto.setNombre(tienda.getNombre());
			    tiendaRepository.save(Producto);
			    
			respuesta.setMensaje("El Producto actualizado correctamente");
		}else {
			respuesta.setMensaje("El Producto no existe");
		}
		return respuesta;
	}

	@Override
	public Response deleteTienda(String Codigo) throws Exception {
		
		Optional<ApiTienda> Product =tiendaRepository.findById(Long.valueOf(Codigo));
		Response respuesta = new Response();
	
		if (Product.isPresent()) {
			
			ApiTienda ProductoExistente = Product.get();
			tiendaRepository.delete(ProductoExistente);
	        
			respuesta.setMensaje("El Producto eliminado correctamente");
		}else {
			respuesta.setMensaje("El Producto no existe");
			throw new Exception("Exploto");
		}
		return respuesta;
	}

	@Override
	public List<Productos> obtenerProductos() {
		return null;
	}

}
