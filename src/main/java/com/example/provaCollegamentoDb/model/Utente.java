package com.example.provaCollegamentoDb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUtente;
    private String nomeUtente;
    private String password;

    public Long getIdUtente() {
        return idUtente;
    }
    public void setIdUtente(Long idUtente) {
        this.idUtente = idUtente;
    }
    public String getNomeUtente() {
        return nomeUtente;
    }
    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
