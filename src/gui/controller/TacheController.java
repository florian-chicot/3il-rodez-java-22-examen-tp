package gui.controller;

import gui.model.Tache;
import gui.view.TacheView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TacheController {
    private Tache model;
    private TacheView view;

    public TacheController(Tache model, TacheView view) {
        this.model = model;
        this.view = view;

        //Ajout d'un listener pour le bouton ajouter
        view.generateAjouterButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.creerFormulaireAjout();
            }
        });
    }


}
