package ipi.perso.sel.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.sun.istack.NotNull;

@Entity
public class Rubrique {

    @Id
	private int code;

    @NotNull
    @Column(columnDefinition = "VARCHAR(255)")
    private String libelle;
    
    @ManyToOne
    @JoinColumn(name = "category_code")
    private Category category;
    
    /*@OneToMany(mappedBy = "rubrique")
    private List<Offre> offres;*/
    
    public Rubrique() {}

    public Rubrique(int code, String libelle, Category category) {
        this.code = code;
        this.libelle = libelle;
        this.category = category;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
