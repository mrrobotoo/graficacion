package mx.com.cuh.repository;

import java.util.List;

import javax.persistence.Tuple;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.com.cuh.entity.Autor;
import mx.com.cuh.pojo.Alumnos;

@Repository
public interface AutorRepository  extends CrudRepository<Autor, Long>{

	@Query(value="SELECT NOMBRE, COUNT(*) matricula FROM AUTOR GROUP BY NOMBRE", nativeQuery = true)
	public  List<Tuple> obtenervaloreslocos();
	
}
