package mx.com.cuh.service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Tuple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.cuh.entity.Autor;
import mx.com.cuh.entity.Words2;
import mx.com.cuh.pojo.Alumnos;
import mx.com.cuh.pojo.Response;
import mx.com.cuh.pojo.Words2Pojo;
import mx.com.cuh.pojo.Words2Response;
import mx.com.cuh.repository.Words2Repository;

@Service
public class Words2Impl implements Words2Service{
	
	@Autowired
	private Words2Repository words2Repository;
	@Override
	
	public List<Words2Pojo> obtenerWords() {
		List<Words2Pojo> listaWords = new ArrayList<>();
		
		Words2Pojo word1 = new Words2Pojo();
		word1.setIdw((long) 4);
		word1.setWord("Are you kidding me? - Me estás bromeando?");
		listaWords.add(word1);
		Words2Pojo word2 = new Words2Pojo();
		word2.setIdw((long) 5);
		word2.setWord("Shut up - Sharap - Cállate?");
		listaWords.add(word2);
		return listaWords;
	}

	
	@Override
	public Response insertarFrase(List<Words2> cosa) {
		List<Tuple> cosita = words2Repository.obtenerfullvalores();
		Response respuesta = new Response();
		
		for (Words2 cosita2 : cosa) {
			words2Repository.save(cosita2);
		}
		
		respuesta.setMensaje("se ha guardado");
		return respuesta;
	}


	@Override
	public List<Words2> obtenerWords2() {
		return (List<Words2>) words2Repository.findAll();
	}

	
}
