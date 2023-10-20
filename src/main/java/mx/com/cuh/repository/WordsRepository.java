package mx.com.cuh.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.com.cuh.entity.Words;

@Repository
public interface WordsRepository extends CrudRepository<Words, Long>{



}
