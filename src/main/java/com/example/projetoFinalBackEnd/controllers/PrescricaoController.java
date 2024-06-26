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
    public Prescricao create(@RequestBody Prescricao prescricao) {
        return service.save(prescricao);
    }

    @GetMapping("/{id}")
    public Prescricao getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public Prescricao update(@PathVariable Long id, @RequestBody Prescricao prescricao) {
        prescricao.setId(id);
        return service.save(prescricao);  // O método save é usado tanto para criar quanto para atualizar
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }
}
