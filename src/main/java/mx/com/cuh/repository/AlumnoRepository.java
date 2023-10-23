package mx.com.cuh.repository;

import java.util.List;

import javax.persistence.Tuple;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.com.cuh.entity.Alumno;

@Repository
public interface AlumnoRepository  extends CrudRepository<Alumno, Long>{

	@Query(value="SELECT NOMBRE, COUNT(*) matricula FROM AUTOR GROUP BY NOMBRE", nativeQuery = true)
	public  List<Tuple> obtenervaloreslocos();
	
	@Query(value="delete from      LIBROAUTOR where codigoautor= :matricula", nativeQuery = true)
	public void borradoLoco(Long matricula);
	
}
