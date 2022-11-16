package tn.spring.springboot.entity;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@Table( name= "Departement")
public class Departement implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDepart;
    private String nomDepart;
    @OneToMany (cascade = CascadeType.ALL, mappedBy= "departement")
    private Set<Etudiant> Etudiants;

    public Departement(int i, String finance) {
    }

    public int getIdDepart() {
        return idDepart;
    }


    public void setIdDepart(int idDepart) {
        this.idDepart = idDepart;
    }

    public String getNomDepart() {
        return nomDepart;
    }

    public void setNomDepart(String nomDepart) {
        this.nomDepart = nomDepart;
    }
}
