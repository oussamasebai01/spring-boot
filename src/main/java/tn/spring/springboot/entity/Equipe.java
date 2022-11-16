package tn.spring.springboot.entity;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@SpringBootApplication
@Entity
@Table( name= "Equipe")
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEquipe;
    private String nomEquipe;
    private Number Niveau;
    @ManyToMany(cascade =  CascadeType.ALL)
    private Set<Etudiant> etudiants;
    @OneToOne
    private DetailEquipe detailEquipe;
    public int getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(int idEquipe) {
        this.idEquipe = idEquipe;
    }

    public String getNomEquipe() {
        return nomEquipe;
    }

    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }

    public Number getNiveau() {
        return Niveau;
    }

    public void setNiveau(Number niveau) {
        Niveau = niveau;
    }
}
