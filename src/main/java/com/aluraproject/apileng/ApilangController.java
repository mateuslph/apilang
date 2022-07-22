package com.aluraproject.apileng;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApilangController {

    @Autowired
    private ApilangRepository repositoryInitial;

    @GetMapping(value = "/linguagens")
    public List<Apilang> getterLanguage() {
        List<Apilang> languageChosen = repositoryInitial.findAll();
        return languageChosen;
    }

    @PostMapping(value = "/linguagens")
    public Apilang registerLanguage(@RequestBody Apilang languageChosen) {
        Apilang savedLanguage = repositoryInitial.save(languageChosen);
        return savedLanguage;
    }
    
}
