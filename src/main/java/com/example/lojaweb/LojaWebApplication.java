package com.example.lojaweb;

import java.math.BigDecimal;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.lojaweb.domain.Ingrediente;
import com.example.lojaweb.repositories.IngredienteRepository;

@SpringBootApplication
public class LojaWebApplication implements CommandLineRunner {
	
	@Autowired
	private IngredienteRepository ingredienteRepository;

	public static void main(String[] args) {
		SpringApplication.run(LojaWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Ingrediente alface = new Ingrediente(null, "Alface", new BigDecimal(0.40));
		Ingrediente bacon = new Ingrediente(null, "Bacon", new BigDecimal(2.00));

		ingredienteRepository.saveAll(Arrays.asList(alface, bacon));
	}

}
