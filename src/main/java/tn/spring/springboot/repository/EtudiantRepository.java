package tn.spring.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.entity.Departement;
import tn.spring.springboot.entity.Etudiant;
import tn.spring.springboot.entity.Niveau;

import java.util.List;
@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {


}
