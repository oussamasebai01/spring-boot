package tn.spring.springboot.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.spring.springboot.entity.Equipe;
import tn.spring.springboot.services.EquipeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/equipe")
@NoArgsConstructor
public class EquipeRestController {

    EquipeService equipeService;

    @GetMapping("/retrieve-all-equipes")
    public List<Equipe> getEquipes(){
        return equipeService.getAllEquipe();
    }



}
