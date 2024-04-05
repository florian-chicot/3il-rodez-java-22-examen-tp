package tests;

import gui.model.Tache;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TacheTest {

    @org.junit.jupiter.api.Test
    void getTitre() {
        Tache tache = new Tache("Tâche", "Petite tâche", new Date(2024, 12, 8));

        assertEquals("Tâche", tache.getTitre());
    }

    @org.junit.jupiter.api.Test
    void getDescription() {
        Tache tache = new Tache("Tâche", "Petite tâche", new Date(2024, 12, 8));

        assertEquals("Petite tâche", tache.getDescription());
    }

    @org.junit.jupiter.api.Test
    void getDateEcheance() {
        Tache tache = new Tache("Tâche", "Petite tâche", new Date(2024, 12, 8));

        assertEquals(new Date(2024, 12, 8), tache.getDateEcheance());
    }

    @org.junit.jupiter.api.Test
    void afficherTache() {
        Tache tache = new Tache("Tâche", "Petite tâche", new Date(2024, 12, 8));

        assertEquals("Tâche (Petite tâche) pour le Thu Jan 08 00:00:00 CET 3925", tache.afficherTache());
    }
}