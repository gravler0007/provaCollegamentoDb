package com.example.provaCollegamentoDb.model;


import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEvento;
    private Long idUtente;//id dell'utente che ha creato l'evento
    private String titolo;
    private int id_categoria; 
    private String luogo;
    private Date data;
    private String descrizione;
    
    public Long getIdEvento() {
        return idEvento;
    }
    public void setIdEvento(Long idEvento) {
        this.idEvento = idEvento;
    }
    public Long getIdUtente() {
        return idUtente;
    }
    public void setIdUtente(Long idUtente) {
        this.idUtente = idUtente;
    }
    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public int getId_categoria() {
        return id_categoria;
    }
    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }
    public String getLuogo() {
        return luogo;
    }
    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    


}
