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
	private String userPrenom;
	private String userCommune;
	private LocalDate dateCreation;
	private String photoLien;
	private Rubrique rubrique;
	private Category category;
	
	public OffreDto() {}
	
	public OffreDto(Long id, String titre, String text, Long userId, String userPrenom, String userCommune,
			LocalDate dateCreation, String photoLien, Rubrique rubrique, Category category) {
		this.id = id;
		this.titre = titre;
		this.text = text;
		this.userId = userId;
		this.userPrenom = userPrenom;
		this.userCommune = userCommune;
		this.dateCreation = dateCreation;
		this.photoLien = photoLien;
		this.rubrique = rubrique;
		this.category = category;
	}

//	public OffreDto(Object offre) {
//		this.id = ((OffreDto) offre).getId();
//		this.titre = ((OffreDto) offre).getTitre();
//		this.text = ((OffreDto) offre).getText();
//		this.userId = ((OffreDto) offre).getUserId().getId();
//		this.dateCreation = ((OffreDto) offre).getDateCreation();
//		this.photoLien = ((OffreDto) offre).getPhotoLien();
//		this.rubrique = ((OffreDto) offre).getRubrique();
//		this.category = ((OffreDto) offre).getRubrique().getCategory();
//
//	}

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

	public String getPhotoLien() {
		return photoLien;
	}

	public void setPhotoLien(String photoLien) {
		this.photoLien = photoLien;
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
