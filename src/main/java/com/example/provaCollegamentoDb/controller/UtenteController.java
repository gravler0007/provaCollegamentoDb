package com.example.provaCollegamentoDb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.provaCollegamentoDb.service.UtenteService;

@Controller
@RequestMapping("/login")
public class UtenteController {
    
    @Autowired
    UtenteService utenteService;

    public String mostraLogin(){
        return "login";
    }

    
}
