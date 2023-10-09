package mx.com.cuh.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.com.cuh.entity.Autor;

@Repository
public interface AutorRepository  extends CrudRepository<Autor, Long>{

}
