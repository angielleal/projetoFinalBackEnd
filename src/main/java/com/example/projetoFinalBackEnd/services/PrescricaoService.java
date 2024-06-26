package com.example.projetoFinalBackEnd.services;

import com.example.projetoFinalBackEnd.models.Medicamento;
import com.example.projetoFinalBackEnd.models.Paciente;
import com.example.projetoFinalBackEnd.models.Prescricao;
import com.example.projetoFinalBackEnd.repositories.MedicamentoRepository;
import com.example.projetoFinalBackEnd.repositories.PacienteRepository;
import com.example.projetoFinalBackEnd.repositories.PrescricaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrescricaoService {
    @Autowired
    private PrescricaoRepository prescricaoRepository;

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private MedicamentoRepository medicamentoRepository;

    public List<Prescricao> findAll() {
        return prescricaoRepository.findAll();
    }

    public Prescricao save(Prescricao prescricao) {
        Optional<Paciente> pacienteOpt = pacienteRepository.findById(prescricao.getPaciente().getId());
        Optional<Medicamento> medicamentoOpt = medicamentoRepository.findById(prescricao.getMedicamento().getId());

        if (pacienteOpt.isPresent() && medicamentoOpt.isPresent()) {
            prescricao.setPaciente(pacienteOpt.get());
            prescricao.setMedicamento(medicamentoOpt.get());
            return prescricaoRepository.save(prescricao);
        } else {
            // Handle the case where paciente or medicamento is not found
            throw new RuntimeException("Paciente or Medicamento not found");
        }
    }

    public Prescricao findById(Long id) {
        return prescricaoRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        prescricaoRepository.deleteById(id);
    }
}
