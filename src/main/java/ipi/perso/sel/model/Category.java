package ipi.perso.sel.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

    @Id
	private int categoryCode;

    @Column(columnDefinition = "VARCHAR(100)")
    private String libelle;
    
    /*@OneToMany(mappedBy = "category")
    private List<Rubrique> rubriques;*/
    
    public Category() {}

    public Category(int code, String libelle) {
        this.categoryCode = code;
        this.libelle = libelle;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
