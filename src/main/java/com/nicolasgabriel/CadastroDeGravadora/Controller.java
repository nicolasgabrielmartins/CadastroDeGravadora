package com.nicolasgabriel.CadastroDeGravadora;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
    @GetMapping("/home")
    public String boasVindas(){
        return "Bem vindo! Essa é a minha primeira rota criada no Spring";
    }
}
