package com.example.lojaweb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lojaweb.domain.Ingrediente;
import com.example.lojaweb.repositories.IngredienteRepository;

@Service
public class IngredienteService {
	
	@Autowired
	IngredienteRepository repo;

	public Ingrediente buscar(Integer id) {
		
		Optional<Ingrediente> obj = repo.findById(id);		
		return obj.orElse(null);
	}
}
