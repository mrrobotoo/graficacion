package mx.com.cuh.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.cuh.entity.Words;

import mx.com.cuh.repository.WordsRepository;

@Service
public class WordsServices {
	@Autowired
	WordsRepository wordRepository;
	
	public ArrayList<Words> obtenerwords(){
		return (ArrayList<Words>)wordRepository.findAll();
	}
	
	public Words guardarwords(Words word) {
		return wordRepository.save(word);
	}


}
