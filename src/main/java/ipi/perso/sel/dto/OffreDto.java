package ipi.perso.sel.dto;

import java.time.LocalDate;

import ipi.perso.sel.model.Category;
import ipi.perso.sel.model.Offre;
import ipi.perso.sel.model.Publication;
import ipi.perso.sel.model.Rubrique;

public class OffreDto {
	
	private Long id;
	private String titre;
	private String text;
	private Long userId;
	private String userNom;
	private String userPrenom;
	private String userCommune;
	private LocalDate dateCreation;
	private Rubrique rubrique;
	private Category category;
	
	public OffreDto() {}
	
	public OffreDto(Long id, String titre, String text, Long userId, String userNom, String userPrenom, String userCommune,
			LocalDate dateCreation, Rubrique rubrique, Category category) {
		this.id = id;
		this.titre = titre;
		this.text = text;
		this.userId = userId;
		this.setUserNom(userNom);
		this.userPrenom = userPrenom;
		this.userCommune = userCommune;
		this.dateCreation = dateCreation;
		this.rubrique = rubrique;
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserNom() {
		return userNom;
	}

	public void setUserNom(String userNom) {
		this.userNom = userNom;
	}

	public String getUserPrenom() {
		return userPrenom;
	}

	public void setUserPrenom(String userPrenom) {
		this.userPrenom = userPrenom;
	}

	public String getUserCommune() {
		return userCommune;
	}

	public void setUserCommune(String userCommune) {
		this.userCommune = userCommune;
	}

	public LocalDate getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(LocalDate dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Rubrique getRubrique() {
		return rubrique;
	}

	public void setRubrique(Rubrique rubrique) {
		this.rubrique = rubrique;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	
	

}
