package com.example.projetoFinalBackEnd.controllers;

import com.example.projetoFinalBackEnd.models.Prescricao;
import com.example.projetoFinalBackEnd.services.PrescricaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prescricoes")
public class PrescricaoController {
    @Autowired
    private PrescricaoService service;

    @GetMapping
    public List<Prescricao> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Prescricao create(@RequestBody Prescricao pres
