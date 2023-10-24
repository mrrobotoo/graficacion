package mx.com.cuh.repository;

import java.util.List;

import javax.persistence.Tuple;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.com.cuh.entity.FormulaEntity;

@Repository
public interface FormulaRepository extends CrudRepository<FormulaEntity, Integer>{
	@Query(value="SELECT NOMBRE, COUNT(*) id FROM formula GROUP BY NOMBre", nativeQuery = true)
	public List<Tuple> obtenerDatos();
	@Query(value="delete from formula where id= :id", nativeQuery=true)
	public FormulaEntity eliminarDatos();

}
