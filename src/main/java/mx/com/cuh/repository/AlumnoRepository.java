package mx.com.cuh.repository;

import java.util.List;

import javax.persistence.Tuple;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.com.cuh.entity.Alumno;

@Repository
public interface AlumnoRepository  extends CrudRepository<Alumno, Long>{

	@Query(value="SELECT Alumno, COUNT(*) matricula FROM CONTROL GROUP BY Alumno", nativeQuery = true)
	public  List<Tuple> obtenervalores();
	
	//@Query(value="delete from      CONTROL where codigoautor= :matricula", nativeQuery = true)
	//public void borrar(Long matricula);
	
}


 
