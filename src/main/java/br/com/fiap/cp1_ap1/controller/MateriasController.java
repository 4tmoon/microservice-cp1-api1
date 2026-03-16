package br.com.fiap.cp1_ap1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MateriasController {

    @GetMapping("/materias")
    public String atividadePendente(){
        return "Matérias do semestre: Java, Redes, Kotlin, Flutter e Microsserviços";
    }

}
