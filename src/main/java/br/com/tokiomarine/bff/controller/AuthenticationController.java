package br.com.tokiomarine.bff.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home")
public class AuthenticationController {

    @GetMapping
    public String retorno() {

        return "api rodando!";
    }

}
