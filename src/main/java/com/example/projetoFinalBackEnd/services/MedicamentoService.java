package com.example.projetoFinalBackEnd.services;

import com.example.projetoFinalBackEnd.models.Medicamento;
import com.example.projetoFinalBackEnd.repositories.MedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicamentoService {
    @Autowired
    private MedicamentoRepository repository;

    public List<Medicamento> findAll() {
        return repository.findAll();
    }

    public Medicamento save(Medicamento medicamento) {
        return repository.save(medicamento);
    }

    public Medicamento findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
