package br.edu.ifpe.recife.gcms.WebApp;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController { 
	@RequestMapping("/Carla") 
	public @ResponseBody String greeting() { 
		return "Hello, World! Carla"; 
		System.out.println("Modificando o cód");
		} 
	}