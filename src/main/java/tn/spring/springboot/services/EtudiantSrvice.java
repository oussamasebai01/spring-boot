package tn.spring.springboot.services;

import org.springframework.stereotype.Service;
import tn.spring.springboot.entity.Departement;
import tn.spring.springboot.entity.Etudiant;

import java.util.List;


public interface EtudiantSrvice {
    List<Etudiant> retrieveAllEtudiants();
    void addEtudiant(Etudiant e);
    void removeEtudiant(Integer idEtudiant);

    Etudiant updateEtudiant (Etudiant e);
}
