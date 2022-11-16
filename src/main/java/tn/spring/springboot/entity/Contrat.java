package tn.spring.springboot.entity;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import javax.persistence.*;
import javax.swing.text.html.Option;
import java.io.Serializable;
import java.util.Date;

@SpringBootApplication
@Entity
@Table( name= "Contrat")
public class Contrat implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idContrat;
    @Temporal (TemporalType.DATE)
    private Date dateDebutContrat;
    private Date dateFINContrat;

    @ManyToOne
    Etudiant etudiant;
    public int getIdContrat() {
        return idContrat;
    }

    public void setIdContrat(int idContrat) {
        this.idContrat = idContrat;
    }

    public Date getDateDebutContrat() {
        return dateDebutContrat;
    }

    public void setDateDebutContrat(Date dateDebutContrat) {
        this.dateDebutContrat = dateDebutContrat;
    }

    public Date getDateFINContrat() {
        return dateFINContrat;
    }

    public void setDateFINContrat(Date dateFINContrat) {
        this.dateFINContrat = dateFINContrat;
    }
}
