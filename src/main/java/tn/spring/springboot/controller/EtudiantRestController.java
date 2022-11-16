package tn.spring.springboot.controller;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.internal.EntityManagerMessageLogger_$logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.entity.Etudiant;
import tn.spring.springboot.services.EtudiantSrvice;

import java.util.List;

@RestController
//@AllArgsConstructor
@NoArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantRestController {

    @Autowired
    EtudiantSrvice etudiantSrvice;

    @PostMapping("/add")
    public void addEtudiant(@RequestBody Etudiant e)
    {
        etudiantSrvice.addEtudiant(e);
    }

    @GetMapping("/affichage")
    public List<Etudiant> Affichage()
    {
        return etudiantSrvice.retrieveAllEtudiants();
    }

    @DeleteMapping("/Delete/{id}")
    public void removeEtudiant (@PathVariable("id") Integer etudiantId){

        etudiantSrvice.removeEtudiant(etudiantId);
    }

    @PutMapping("/apdate")
    public Etudiant Modifier(@RequestBody Etudiant e)
    {
        return etudiantSrvice.updateEtudiant(e);
    }
}
