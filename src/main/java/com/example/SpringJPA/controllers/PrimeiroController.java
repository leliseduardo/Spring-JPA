package com.example.SpringJPA.controllers;

import org.springframework.web.bind.annotation.*;

@RestController  // Transforma a classe em uma API REST, podendo usar as operações HTTP
public class PrimeiroController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET) // Configura path para executar função como
    public String hello() {                                         // se fosse GET
        return "Olá Spring Boot!";
    }


//    Aula simulando erros
//    @RequestMapping(value = "/hello", method = RequestMethod.POST) // Configura path para executar função como
//    public String hello2() {                                         // se fosse GET
//        return "Olá Spring Boot! Post";
//    }
}
