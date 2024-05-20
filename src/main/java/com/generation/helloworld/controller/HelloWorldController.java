package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola-mundo")
public class HelloWorldController {
	
	
	@GetMapping
	public String ola() {
		return "Olá mundo! bom dia!";
	}
	
	@GetMapping("comidas")
	public String comidasFavoritas() {
		return "sushi \nHamburguer";
	}
	
	@GetMapping("livros")
	public String livros() {
		return "Eragon \nSenhor dos anéis";
	}
	
	@GetMapping("bsms")
	public String BsmGeneration() {
		return "Orientação ao Futuro \nResponsabilidade Pessoal \nMentalidade de Crescimento \nPersistencia";
	}
	
	@GetMapping("objetivos")
	public String objetivosAprendizado() {
		return "Melhorar a Comunicação \nAprimorar conhecimentos em Spring \nTrabalho em equipe";
	}

}
