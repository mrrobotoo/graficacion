package mx.com.cuh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import mx.com.cuh.entity.Colegiatura;

@Repository
public interface ColegiaturaRepository extends CrudRepository<Colegiatura, Long> {

    // Puedes definir consultas personalizadas aquí si es necesario
    // Por ejemplo:
    @Query(value = "SELECT * FROM COLEGIATURA WHERE ALUMNO = :matricula", nativeQuery = true)
    public List<Colegiatura> encontrarColegiaturasPorMatricula(String matricula);
}
