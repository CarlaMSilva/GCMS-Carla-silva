package br.edu.ifpe.recife.gcms.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;  // Importando a anotação @GetMapping

@Controller
public class HomeController { 
    @RequestMapping("/Carla")
    public @ResponseBody String greeting() {
        System.out.println("Modificando o cód");  // Agora será executado
        return "Hello, World! Carla"; 
    }

    @GetMapping("/hotfix")
    public String hotfix() {
        return "This is a hotfix!";
    }
}
