package ipi.perso.sel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Echange {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long idEmetteur;

    private Long idBeneficiaire;

    private LocalDate dateEchange;

    private int category;

    private Integer minutes;

    public Echange() {
    }

    public Echange(Long id, Long idEmetteur, Long idBeneficiaire, LocalDate dateEchange, int category, Integer minutes) {
        this.id = id;
        this.idEmetteur = idEmetteur;
        this.idBeneficiaire = idBeneficiaire;
        this.dateEchange = dateEchange;
        this.category = category;
        this.minutes = minutes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdEmetteur() {
        return idEmetteur;
    }

    public void setIdEmetteur(Long idEmetteur) {
        this.idEmetteur = idEmetteur;
    }

    public Long getIdBeneficiaire() {
        return idBeneficiaire;
    }

    public void setIdBeneficiaire(Long idBeneficiaire) {
        this.idBeneficiaire = idBeneficiaire;
    }

    public LocalDate getDateEchange() {
        return dateEchange;
    }

    public void setDateEchange(LocalDate dateEchange) {
        this.dateEchange = dateEchange;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }
}
