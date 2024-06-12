package com.example.provaCollegamentoDb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.provaCollegamentoDb.model.Evento;
import com.example.provaCollegamentoDb.repository.EventoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EventoService {
    // L'annotazione @Service indica che questa classe è un componente di servizio gestito da Spring.

    @Autowired
    private EventoRepository eventoRepository; // Il EventoRepository è utilizzato per accedere ai dati delle ricette nel database.

    // Questo metodo restituisce tutte le ricette presenti nel database.
    public List<Evento> findAll() {
        return eventoRepository.findAll();
    }

    // Questo metodo restituisce una Evento dal database in base al suo ID.
    public Optional<Evento> findById(Long id) {
        return eventoRepository.findById(id);
    }

    // Questo metodo salva una nuova Evento nel database o aggiorna una Evento esistente.
    public Evento save(Evento evento) {
        return eventoRepository.save(evento);
    }

    // Questo metodo elimina una Evento dal database in base al suo ID.
    public void deleteById(Long id) {
        eventoRepository.deleteById(id);
    }
}
