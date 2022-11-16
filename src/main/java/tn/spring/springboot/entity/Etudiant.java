package tn.spring.springboot.entity;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@SpringBootApplication

@Entity
public class Etudiant implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    //@Column(name="idEtudiant")
    private Integer idEtudiant;
    private String prenomE;
    private String nomE;
    @Temporal (TemporalType.DATE)
    private Date dateDebut;
    @Enumerated(EnumType.STRING)
    private Option op;

    public Etudiant(String prenomE, String nomE) {
        this.prenomE = prenomE;
        this.nomE = nomE;
    }

    public Etudiant() {

    }

    public Etudiant(Integer idEtudiant, String prenomE, String nomE) {
        this.idEtudiant = idEtudiant;
        this.prenomE = prenomE;
        this.nomE = nomE;
    }

    @ManyToOne
    Departement departement;
    @ManyToMany(mappedBy = "etudiants", cascade = CascadeType.ALL)
    private Set<Equipe> equipes;
    @OneToMany(cascade = CascadeType.ALL , mappedBy = "etudiant")
    private Set<Contrat> cantrats;
    public Integer getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(Integer idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public String getPrenomE() {
        return prenomE;
    }

    public void setPrenomE(String prenomE) {
        this.prenomE = prenomE;
    }

    public String getNomE() {
        return nomE;
    }

    public void setNomE(String nomE) {
        this.nomE = nomE;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Option getOption() {
        return op;
    }

    public void setOption(Option option) {
        this.op = option;
    }
}

