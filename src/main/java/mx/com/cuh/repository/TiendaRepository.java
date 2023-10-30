package mx.com.cuh.repository;

import java.util.List;

import javax.persistence.Tuple;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.com.cuh.entity.ApiTienda;

@Repository
public interface TiendaRepository  extends CrudRepository<ApiTienda, Long>{

	@Query(value="SELECT Galletas, COUNT(*) CODIGOPRODUCTO FROM Tienda GROUP BY Galletas", nativeQuery = true)
	public  List<Tuple> obtenervaloresTienda();
	
	@Query(value="delete from Tienda where CODIGOPRODUCTO= :CODIGOPRODUCTO", nativeQuery = true)
	public void borrado();
	
}

