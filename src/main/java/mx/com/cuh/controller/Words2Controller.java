package mx.com.cuh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.com.cuh.pojo.Words2Pojo;
import mx.com.cuh.service.Words2Service;

@RestController
@RequestMapping
public class Words2Controller {
	
	@Autowired
	Words2Service words2Service;
	@GetMapping(value="/woget" )
	public List<Words2Pojo> metodGet(@RequestParam(name = "id") String cosa) {

		return words2Service.obtenerWords();
		}
}
