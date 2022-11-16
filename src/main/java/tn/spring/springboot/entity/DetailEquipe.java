package tn.spring.springboot.entity;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.*;
import java.io.Serializable;

@SpringBootApplication
@Entity
@Table( name= "DetailEquipe")
public class DetailEquipe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDetailEquipe;
    private Integer salle;
    private String thematique;

    @OneToOne(mappedBy = "detailEquipe")
    private Equipe equipe;
    public Integer getIdDetailEquipe() {
        return idDetailEquipe;
    }

    public void setIdDetailEquipe(Integer idDetailEquipe) {
        this.idDetailEquipe = idDetailEquipe;
    }

    public Integer getSalle() {
        return salle;
    }

    public void setSalle(Integer salle) {
        this.salle = salle;
    }

    public String getThematique() {
        return thematique;
    }

    public void setThematique(String thematique) {
        this.thematique = thematique;
    }
}
