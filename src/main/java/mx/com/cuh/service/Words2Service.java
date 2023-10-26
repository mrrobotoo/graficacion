package mx.com.cuh.service;

import java.util.List;

import mx.com.cuh.entity.Words2;
import mx.com.cuh.pojo.Response;
import mx.com.cuh.pojo.Words2Pojo;

public interface Words2Service {
	
	List<Words2Pojo>obtenerWords();
	Response insertarFrase(List<Words2>palabrillas);
	List<Words2> obtenerWords2();

	}
