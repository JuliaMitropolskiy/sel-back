package ipi.perso.sel.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Publication {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(columnDefinition = "VARCHAR(255)")
	private String titre;
	
	@Column(columnDefinition = "TEXT")
	private String text;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@Column(columnDefinition = "DATE")
	private LocalDate dateCreation;
	
	@Column(columnDefinition = "VARCHAR(100)")
	private String photoLien;
	

	public Publication() {}
	
	public Publication(Long id, String titre, String text, User user, LocalDate dateCreation) {
		this.id = id;
		this.titre = titre;
		this.text = text;
		this.user = user;
		this.dateCreation = dateCreation;
	}
	
	public Publication(Long id, String titre, String text, User user, LocalDate dateCreation, String photoLien) {
		this.id = id;
		this.titre = titre;
		this.text = text;
		this.user = user;
		this.dateCreation = dateCreation;
		this.photoLien = photoLien;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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
	
	
	

}
