package mx.com.cuh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mx.com.cuh.entity.Colegiatura;
import mx.com.cuh.pojo.Response;
import mx.com.cuh.repository.ColegiaturaRepository;
import mx.com.cuh.service.ColegiaturaService;

import java.util.List;
import java.util.Optional;

@Service
public class ColegiaturaImpl implements ColegiaturaService {

    @Autowired
    private ColegiaturaRepository colegiaturaRepository;

    @Override
    public List<Colegiatura> obtenerColegiaturas() {
       
        return (List<Colegiatura>) colegiaturaRepository.findAll();
    }

    @Override
    public Response insertarColegiatura(Colegiatura colegiatura) {
        
        Colegiatura savedColegiatura = colegiaturaRepository.save(colegiatura);
        return null;
    }

    @Override
    public Response updateColegiatura(Colegiatura colegiatura, Long colegiaturaId) {
    
          
        	return null;
        
    }

    @Override
    public Response deleteColegiatura(Long colegiaturaId) {
       
        Optional<Colegiatura> existingColegiatura = colegiaturaRepository.findById(colegiaturaId);
        if (existingColegiatura.isPresent()) {
            colegiaturaRepository.deleteById(colegiaturaId);
            return null;
        } else {
        	return null;
        }
    }
}