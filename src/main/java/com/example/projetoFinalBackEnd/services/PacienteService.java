package com.example.projetoFinalBackEnd.services;

import com.example.projetoFinalBackEnd.models.Paciente;
import com.example.projetoFinalBackEnd.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepository repository;

    public List<Paciente> findAll() {
        return repository.findAll();
    }

    public Paciente save(Paciente paciente) {
        return repository.save(paciente);
    }

    public Paciente findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
