package br.com.fiap.cp1_ap1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AtividadesController {

    @GetMapping("/item")
    public String atividadePendente(){
        return "A atividade de Kotlin está pendente";
    }

    @GetMapping("lembreteAvaliacao")
    public String lembreteAvaliacao(){
        return "A próxima avaliação é de Java (23/03)";
    }

}
