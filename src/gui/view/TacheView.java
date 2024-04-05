package gui.view;

import javax.swing.*;
import java.awt.*;

public class TacheView extends JPanel {

    private JPanel mainPanel;
    private JButton ajouterButton;
    private JButton modifierButton;
    private JButton supprimerButton;

    public TacheView() {
        this.mainPanel = new JPanel();
        this.ajouterButton = new JButton("Ajouter une tâche");
        this.modifierButton = new JButton("Modifier une tâche");
        this.supprimerButton = new JButton("Supprimer une tâche");

        initGUI();
    }

    private void initGUI() {
        addButton(mainPanel, ajouterButton);
        addButton(mainPanel, modifierButton);
        addButton(mainPanel, supprimerButton);
    }

    private void addButton(JPanel panel, JButton button) {
        panel.add(button);
    }

    public Component getMainPanel() {
        return this.mainPanel;
    }
}
