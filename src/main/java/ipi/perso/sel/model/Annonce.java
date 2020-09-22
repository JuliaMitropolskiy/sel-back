package ipi.perso.sel.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

@Entity
public class Annonce extends Publication {

	@Enumerated(EnumType.STRING)
	private TypeAnnonce type;


	public Annonce() {}
	
	public Annonce(String titre, String text, User user, LocalDate dateCreation, TypeAnnonce type) {
		super(titre, text, user, dateCreation);
		this.type = type;
	}
	

	public TypeAnnonce getType() {
        return type;
    }

    public void setType(TypeAnnonce type) {
        this.type = type;
    }

    
}
