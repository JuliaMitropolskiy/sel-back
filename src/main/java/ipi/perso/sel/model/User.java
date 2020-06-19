package ipi.perso.sel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Column(columnDefinition = "VARCHAR(100)")
    private String nom;
    
    @Column(columnDefinition = "VARCHAR(100)")
    private String prenom;
    
    @Column(columnDefinition = "VARCHAR(255)")
    private String adresse;
    
    @Column(columnDefinition = "VARCHAR(50)")
    private String commune;
    
    @Column(columnDefinition = "VARCHAR(30)")
    private String numTel;
    
    @Column(columnDefinition = "VARCHAR(50)", unique = true)
    private String mail;
    
    @Column(columnDefinition = "VARCHAR(100)")
    private String password;
    
    @Column(columnDefinition = "VARCHAR(100)")
    private String photoLien;
    
    @Column(columnDefinition = "MEDIUMINT")
    private Integer soldeMinutes = 1000;

    public User(){
    }

    public User(String nom, String prenom, String commune, String mail, String password, Integer soldeMinutes) {
        this.nom = nom;
        this.prenom = prenom;
        this.commune = commune;
        this.mail = mail;
        this.password = password;
        this.soldeMinutes = soldeMinutes;
    }

    public User(String nom, String prenom, String adresse, String commune, String numTel, String mail, String password, Integer soldeMinutes) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.commune = commune;
        this.numTel = numTel;
        this.mail = mail;
        this.password = password;
        this.soldeMinutes = soldeMinutes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Integer getSoldeMinutes() {
        return soldeMinutes;
    }

    public void setSoldeMinutes(Integer soldeMinutes) {
        this.soldeMinutes = soldeMinutes;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getPhotoLien() {
        return photoLien;
    }

    public void setPhotoLien(String photoLien) {
        this.photoLien = photoLien;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
