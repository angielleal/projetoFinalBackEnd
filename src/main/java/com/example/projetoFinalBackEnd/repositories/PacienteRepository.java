package com.example.projetoFinalBackEnd.repositories;

import com.example.projetoFinalBackEnd.models.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
