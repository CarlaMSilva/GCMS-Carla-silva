package br.edu.ifpe.recife.gcms.Pratica02;

<<<<<<< HEAD
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping; 
	import org.springframework.web.bind.annotation.ResponseBody;
	
	@Controller 
	public class HomeController {
		
		//@RequestMapping("/") 
		//public @ResponseBody String greeting() {
		//return "Hello, World!";
		//}
		
		@RequestMapping("/carla")
		public @ResponseBody String greetingCarla() { 
			return "Hello, Carla Maria teste da prática 3!";
			}
		
		@RequestMapping("/pessoa")
		public @ResponseBody String greetingPessoa() { 
			return "Hello, Carla Pessoa da prática 3!";
			}
		
		@RequestMapping("/hotfix")
		public @ResponseBody String greetingHotfix() { 
			return "Hello, criação da branch hotfix!";
			}
	
=======
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello, world!";
>>>>>>> a7ed95e8d384f1aa05bf5063a817fd6cb8d3d853
	}

	@RequestMapping("/fulano")
	public @ResponseBody String greetingFulano() {
		return "Hello, Carla Maria!";
	}

	@RequestMapping("/pessoa")
	public @ResponseBody String greetingPessoa() {
		return "Hello, Carla Pessoa!";
	}

}
