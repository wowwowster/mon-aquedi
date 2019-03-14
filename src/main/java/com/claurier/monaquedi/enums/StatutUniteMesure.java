package com.claurier.monaquedi.enums;

public enum StatutUniteMesure {

    VALIDE("Validé"), GELE("Gelé");

    private String libelle;

    StatutUniteMesure(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }

    public static StatutUniteMesure findByLibelle(String statut) {
        for(StatutUniteMesure valeur: values()) {
            if(valeur.libelle.equals(statut)) {
                return valeur;
            }
        }
        return null;
    }
}

