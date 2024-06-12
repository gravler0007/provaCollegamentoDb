package com.example.provaCollegamentoDb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.provaCollegamentoDb.model.Utente;
import com.example.provaCollegamentoDb.repository.UtenteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UtenteService {
    // L'annotazione @Service indica che questa classe è un componente di servizio gestito da Spring.

    @Autowired
    private UtenteRepository utenteRepository; // Il UtenteRepository è utilizzato per accedere ai dati delle ricette nel database.

    // Questo metodo restituisce tutte le ricette presenti nel database.
    public List<Utente> findAll() {
        return utenteRepository.findAll();
    }

    // Questo metodo restituisce una Utente dal database in base al suo ID.
    public Optional<Utente> findById(Long id) {
        return utenteRepository.findById(id);
    }

    // Questo metodo salva una nuova Utente nel database o aggiorna una Utente esistente.
    public Utente save(Utente utente) {
        return utenteRepository.save(utente);
    }

    // Questo metodo elimina una Utente dal database in base al suo ID.
    public void deleteById(Long id) {
        utenteRepository.deleteById(id);
    }
}