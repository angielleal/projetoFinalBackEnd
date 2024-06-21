package com.example.projetoFinalBackEnd.services;

import com.example.projetoFinalBackEnd.models.Prescricao;
import com.example.projetoFinalBackEnd.repositories.PrescricaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrescricaoService {
    @Autowired
    private PrescricaoRepository repository;

    public List<Prescricao> findAll() {
        return repository.findAll();
    }

    public Prescricao save(Prescricao prescricao) {
        return repository.save(prescricao);
    }

    public Prescricao findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
