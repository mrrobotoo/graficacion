package mx.com.cuh.repository;

import java.util.List;

import javax.persistence.Tuple;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import mx.com.cuh.entity.Words2;

public interface Words2Repository extends CrudRepository<Words2, Long> {

	@Query(value="SELECT palabra, COUNT(*) idword FROM frases GROUP BY palabra", nativeQuery = true)
	public  List<Tuple> obtenerfullvalores();
}
