package mx.com.cuh.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.com.cuh.entity.Autor;
import mx.com.cuh.entity.Words2;
import mx.com.cuh.pojo.Response;
import mx.com.cuh.pojo.Words2Pojo;
import mx.com.cuh.service.Words2Service;

@RestController
@RequestMapping(value = "/portalword")
public class Words2Controller {
	
	@Autowired
	Words2Service words2Service;
	@GetMapping(value="/woget" )
	public List<Words2Pojo> metodGet(@RequestParam(name = "id") String cosa) {

		return words2Service.obtenerWords();
		}
	
	//get2
	@GetMapping(value="/woget2")
	public List<Words2> obtenerWords(){
		return words2Service.obtenerWords2();
	}
	
	@PostMapping(value="/wopo")
	public Response crearFrase(@RequestBody List<Words2> palabrillas ) {
		return words2Service.insertarFrase(palabrillas);
	}
}
