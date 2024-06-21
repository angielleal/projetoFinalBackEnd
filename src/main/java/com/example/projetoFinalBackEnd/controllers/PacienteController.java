package com.example.projetoFinalBackEnd.controllers;

import com.example.projetoFinalBackEnd.models.Paciente;
import com.example.projetoFinalBackEnd.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    @Autowired
    private PacienteService service;

    @GetMapping
    public List<Paciente> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Paciente create(@RequestBody Paciente paciente) {
        return service.save(paciente);
    }

    @GetMapping("/{id}")
    public Paciente getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }
}
