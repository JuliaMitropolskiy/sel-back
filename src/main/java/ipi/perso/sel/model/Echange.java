package ipi.perso.sel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import java.time.LocalDate;

@Entity
public class Echange {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "emetteur_id")
    private User emetteur;

    @ManyToOne
    @JoinColumn(name = "beneficiaire_id")
    private User beneficiaire;

    private LocalDate dateEchange;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    private Integer minutes;
    
    private String message;

    public Echange() {
    }

    public Echange(User emetteur, User beneficiaire, LocalDate dateEchange, Category category, Integer minutes) {
        this.emetteur = emetteur;
        this.beneficiaire = beneficiaire;
        this.dateEchange = dateEchange;
        this.category = category;
        this.minutes = minutes;
    }
    
    public Echange(User emetteur, User beneficiaire, LocalDate dateEchange, Category category, Integer minutes, String message) {
        this.emetteur = emetteur;
        this.beneficiaire = beneficiaire;
        this.dateEchange = dateEchange;
        this.category = category;
        this.minutes = minutes;
        this.message = message;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getEmetteur() {
        return emetteur;
    }

    public void setEmetteur(User emetteur) {
        this.emetteur = emetteur;
    }

    public User getBeneficiaire() {
        return beneficiaire;
    }

    public void setBeneficiaire(User beneficiaire) {
        this.beneficiaire = beneficiaire;
    }

    public LocalDate getDateEchange() {
        return dateEchange;
    }

    public void setDateEchange(LocalDate dateEchange) {
        this.dateEchange = dateEchange;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
