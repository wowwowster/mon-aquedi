package com.claurier.monaquedi.Constante;

public enum CodeAgence {
    SIAAP("SIAAP"),
    SANDRE("SANDRE");

    private final String libelle;

    CodeAgence(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }
}
