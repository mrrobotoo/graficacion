package mx.com.cuh.repository;

import java.util.List;

import javax.persistence.Tuple;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.com.cuh.entity.FormulaEntity;

@Repository
public interface FormulaRepository extends CrudRepository<FormulaEntity, Long>{
	public List<Tuple> obtenerDatos();

}
