package mx.com.cuh.service;

import java.util.List;
import mx.com.cuh.entity.Colegiatura;
import mx.com.cuh.pojo.Response;

public interface ColegiaturaService {

    List<Colegiatura> obtenerColegiaturas();
    Response insertarColegiatura(Colegiatura colegiatura);
    Response updateColegiatura(Colegiatura colegiatura, Long colegiaturaId);
    Response deleteColegiatura(Long colegiaturaId);
}
