package gui.model;

import java.util.Date;

/**
 * Modele pour une tache
 * */

public class Tache {
    private String titre;
    private String description;
    private Date dateEcheance;

    /**
     * Constructeur de la classe
     * @param titre
     * @param description
     * @param dateEcheance
     */
    public Tache(String titre, String description, Date dateEcheance) {
        this.titre = titre;
        this.description = description;
        this.dateEcheance = dateEcheance;
    }

    /**
     * Recupere le titre d'une tache
     * @return le titre
     */
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateEcheance() {
        return dateEcheance;
    }

    public void setDateEcheance(Date dateEcheance) {
        this.dateEcheance = dateEcheance;
    }

    public String afficherTache() {
        return titre + " (" + description + ") pour le " + dateEcheance;
    }
}
