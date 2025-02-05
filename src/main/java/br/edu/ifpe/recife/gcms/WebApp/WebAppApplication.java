package br.edu.ifpe.recife.gcms.WebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
=======
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.ResponseBody; 

@Controller 
public class HomeController { 
	@RequestMapping("/") 
	public @ResponseBody String greeting() {
		return "Hello, World!"; 
		} 
	}
>>>>>>> 28fe069e0d0c29116742b7ca7ce0d973e93fd4fb

@SpringBootApplication
public class WebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebAppApplication.class, args);
	}

}
