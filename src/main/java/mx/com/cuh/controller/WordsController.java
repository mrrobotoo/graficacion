package mx.com.cuh.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.cuh.entity.Words;
import mx.com.cuh.service.WordsServices;

@RestController
@RequestMapping ("/word")
public class WordsController {
	@Autowired
	WordsServices wordService;
	
	@GetMapping()
	public ArrayList<Words>obtenerwords()
	{
		return wordService.obtenerwords();
	}
	
	@PostMapping
	public Words guarWords(@RequestBody Words word) {
		return this.wordService.guardarwords(word);
	}

}
