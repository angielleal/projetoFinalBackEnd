package com.example.projetoFinalBackEnd.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/ajuda")
public class AjudaController {

    @GetMapping
    public Map<String, Object> getAjuda() {
        Map<String, Object> ajuda = new HashMap<>();
        ajuda.put("estudantes", new String[]{"Angiel Leal", "Mateus Zanin Fernandes"});
        ajuda.put("projeto", "Projeto de Saúde e Bem-estar");
        ajuda.put("tema", "Gerenciar medicamentos e prescrições médicas.");
        return ajuda;
    }
}
