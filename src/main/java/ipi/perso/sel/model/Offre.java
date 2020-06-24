package ipi.perso.sel.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Offre extends Publication {

	@ManyToOne
    @JoinColumn(name = "code")
	private Rubrique rubrique;

    
    public Offre() {}

	public Offre(Long id, String titre, String text, User user, LocalDate dateCreation, Rubrique rubrique) {
		super(id, titre, text, user, dateCreation);
		this.rubrique = rubrique;
	}
	
	public Offre(Long id, String titre, String text, User user, LocalDate dateCreation, String photoLien, Rubrique rubrique) {
		super(id, titre, text, user, dateCreation);
		this.rubrique = rubrique;
	}

	

	public Rubrique getRubrique() {
        return rubrique;
    }

    public void setRubrique(Rubrique rubrique) {
        this.rubrique = rubrique;
    }

}
