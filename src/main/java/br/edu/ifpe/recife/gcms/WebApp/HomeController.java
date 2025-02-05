package br.edu.ifpe.recife.gcms.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
<<<<<<< HEAD

@Controller
public class HomeController {

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello, World! Como estamos?";
    }

    @RequestMapping("/fulano")
    public @ResponseBody String greetingFulano() {
        return "Hello, Fulano!";
    }
}

=======
import org.springframework.web.bind.annotation.GetMapping;  // Importando a anotação @GetMapping

@Controller
public class HomeController { 
    @RequestMapping("/Carla")
    public @ResponseBody String greeting() {
        System.out.println("Modificando o cód");  // Agora será executado
        return "Hello, World! Carla Maria"; 
    }

    @GetMapping("/hotfix")
    public String hotfix() {
        return "This is a hotfix!";
    }
}
>>>>>>> 28fe069e0d0c29116742b7ca7ce0d973e93fd4fb
