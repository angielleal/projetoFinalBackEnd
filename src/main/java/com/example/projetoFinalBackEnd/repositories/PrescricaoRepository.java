package com.example.projetoFinalBackEnd.repositories;

import com.example.projetoFinalBackEnd.models.Prescricao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescricaoRepository extends JpaRepository<Prescricao, Long> {
}
