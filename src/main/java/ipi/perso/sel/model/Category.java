package ipi.perso.sel.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

    @Id
	private int id;

    @Column(columnDefinition = "VARCHAR(100)")
    private String libelle;
    
    /*@OneToMany(mappedBy = "category")
    private List<Rubrique> rubriques;*/
    
    public Category() {}

    public Category(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
