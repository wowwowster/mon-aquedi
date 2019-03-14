package com.claurier.monaquedi.bean;

import java.time.LocalDate;
import java.time.LocalDateTime;

/** @author claurier
 * Javabean utilisé pour envoyer ou recevoir des donnée relatives au FrontEnd, passerelle entre l'entity bean correspondant et le FrontEnd.
 * Le Javabean est précisément lié à l'entity bean UniteMesure
 * TODO => appliquer le pattern Builder
 */
public class UniteMesureBean {

    private Integer id;
    private String codeSandre;
    private String codeAgence;
    private String libelle;
    private String statut;
    private LocalDate dateCreation;
    private LocalDateTime dateModification;
    private String symbole;
    private String description;
    private Boolean isPivot = false;

    public UniteMesureBean() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodeSandre() {
        return codeSandre;
    }

    public void setCodeSandre(String codeSandre) {
        this.codeSandre = codeSandre;
    }

    public String getCodeAgence() {
        return codeAgence;
    }

    public void setCodeAgence(String codeAgence) {
        this.codeAgence = codeAgence;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public LocalDateTime getDateModification() {
        return dateModification;
    }

    public void setDateModification(LocalDateTime dateModification) {
        this.dateModification = dateModification;
    }

    public String getSymbole() {
        return symbole;
    }

    public void setSymbole(String symbole) {
        this.symbole = symbole;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getPivot() {
        return isPivot;
    }

    public void setPivot(Boolean pivot) {
        isPivot = pivot;
    }

    @Override
    public String toString() {
        return "UniteMesureBean{" +
                "id=" + id +
                ", codeSandre='" + codeSandre + '\'' +
                ", codeAgence='" + codeAgence + '\'' +
                ", libelle='" + libelle + '\'' +
                ", statut='" + statut + '\'' +
                ", dateCreation=" + dateCreation +
                ", dateModification=" + dateModification +
                ", symbole='" + symbole + '\'' +
                ", description='" + description + '\'' +
                ", isPivot=" + isPivot +
                '}';
    }
}

