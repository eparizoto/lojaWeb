package com.example.lojaweb.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.lojaweb.domain.Ingrediente;
import com.example.lojaweb.services.IngredienteService;

@RestController
@RequestMapping(value = "/ingredientes")
public class IngredienteResource {
	
	@Autowired	
	private IngredienteService service;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Ingrediente obj = service.buscar(id);
		
		return ResponseEntity.ok().body(obj);
		
	}

}
