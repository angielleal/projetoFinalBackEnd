package com.example.projetoFinalBackEnd.services;

import com.example.projetoFinalBackEnd.models.Medicamento;
import com.example.projetoFinalBackEnd.repositories.MedicamentoRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MedicamentoServiceTest {

    @InjectMocks
    private MedicamentoService medicamentoService;

    @Mock
    private MedicamentoRepository medicamentoRepository;

    public MedicamentoServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindById() {
        Medicamento medicamento = new Medicamento();
        medicamento.setId(1L);
        when(medicamentoRepository.findById(1L)).thenReturn(Optional.of(medicamento));

        Medicamento found = medicamentoService.findById(1L);
        assertNotNull(found);
        assertEquals(1L, found.getId());
    }

    @Test
    void testSave() {
        Medicamento medicamento = new Medicamento();
        medicamento.setNome("Aspirina");
        when(medicamentoRepository.save(medicamento)).thenReturn(medicamento);

        Medicamento saved = medicamentoService.save(medicamento);
        assertNotNull(saved);
        assertEquals("Aspirina", saved.getNome());
    }
}
