package fr.eni.demospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccueilController {

    @GetMapping("/accueil")
    public String afficherAccueil(){
        System.out.println("syso");
        return "accueil";
    }

    @GetMapping("/bonjour")
    public String afficherBonjour(){
        return "bonjour";
    }
}
