package tn.spring.springboot.entity;
import org.hibernate.engine.internal.Cascade;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@SpringBootApplication
@Entity
@Table( name= "Universite")
public class Universite implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUniv;
    private String nomUniv;
@OneToMany(cascade = CascadeType.ALL)
private Set<Departement> departement;
    public int getIdUniv() {
        return idUniv;
    }

    public void setIdUniv(int idUniv) {
        this.idUniv = idUniv;
    }

    public String getNomUniv() {
        return nomUniv;
    }

    public void setNomUniv(String nomUniv) {
        this.nomUniv = nomUniv;
    }
}
