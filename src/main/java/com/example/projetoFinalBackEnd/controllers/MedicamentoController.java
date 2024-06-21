package com.example.projetoFinalBackEnd.controllers;

import com.example.projetoFinalBackEnd.models.Medicamento;
import com.example.projetoFinalBackEnd.services.MedicamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicamentos")
public class MedicamentoController {
    @Autowired
    private MedicamentoService service;

    @GetMapping
    public List<Medicamento> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Medicamento create(@RequestBody Medicamento medicamento) {
        return service.save(medicamento);
    }

    @GetMapping("/{id}")
    public Medicamento getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }
}
