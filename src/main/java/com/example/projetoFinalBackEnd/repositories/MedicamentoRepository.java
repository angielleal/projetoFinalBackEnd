package com.example.projetoFinalBackEnd.repositories;

import com.example.projetoFinalBackEnd.models.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {
}
