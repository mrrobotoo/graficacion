package mx.com.cuh.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.cuh.pojo.Words2Pojo;
import mx.com.cuh.repository.Words2Repository;

@Service
public class Words2Impl implements Words2Service{
	
	@Autowired
	private Words2Repository words2Repository;
	@Override
	public List<Words2Pojo> obtenerWords() {
		List<Words2Pojo> listaWords = new ArrayList<>();
		return listaWords;
	}

}
