package tn.spring.springboot.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.entity.Departement;
import tn.spring.springboot.entity.Etudiant;
import tn.spring.springboot.repository.EtudiantRepository;

import java.util.List;
@Service
@Slf4j
public class EtudantServiceImpl implements EtudiantSrvice{
    @Autowired
    EtudiantRepository etudiantRepository;

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    public void addEtudiant(Etudiant e) {
        Etudiant etudiant = etudiantRepository.save(e);

    }


    public void removeEtudiant(Integer idEtudiant) {

        etudiantRepository.deleteById(Long.valueOf(idEtudiant));
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }
}
