package ipi.perso.sel.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Offre extends Publication {

	@ManyToOne
    @JoinColumn(name = "rubrique_id")
	private Rubrique rubrique;

    public Offre() {}

	public Offre(String titre, String text, User user, LocalDate dateCreation, Rubrique rubrique) {
		super(titre, text, user, dateCreation);
		this.rubrique = rubrique;
	}
	

	public Rubrique getRubrique() {
        return rubrique;
    }

    public void setRubrique(Rubrique rubrique) {
        this.rubrique = rubrique;
    }

}
