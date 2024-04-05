package gui.view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class TacheView extends JPanel {

    private JPanel mainPanel;
    private JButton ajouterButton;
    private JButton modifierButton;
    private JButton supprimerButton;
    private JPanel formulaireAjoutPanel;
    private JPanel activePanel;

    private JLabel titreLabel;
    private JLabel descriptionLabel;
    private JLabel dateLabel;

    public TacheView() {
        this.activePanel = new JPanel();
        this.mainPanel = new JPanel();
        this.ajouterButton = new JButton("Ajouter");
        this.modifierButton = new JButton("Modifier");
        this.supprimerButton = new JButton("Supprimer");

        this.formulaireAjoutPanel = new JPanel();
        this.titreLabel = new JLabel("Titre : ");
        this.descriptionLabel = new JLabel("Description : ");
        this.dateLabel = new JLabel("Date : ");

        initGUI();
    }

    private void initGUI() {
        this.activePanel = this.mainPanel;
        addButton(mainPanel, ajouterButton);
        addButton(mainPanel, modifierButton);
        addButton(mainPanel, supprimerButton);
    }

    private void addButton(JPanel panel, JButton button) {
        panel.add(button);
    }

    private void addLabel(JPanel panel, JLabel label) {
        panel.add(label);
    }

    public JPanel getActivePanel() {
        return this.activePanel;
    }

    public JPanel getMainPanel() {
        return this.mainPanel;
    }

    public JPanel getFormulaireAjoutPanel() {
        return this.formulaireAjoutPanel;
    }

    public void generateAjouterButtonListener(ActionListener listener) {
        this.ajouterButton.addActionListener(listener);
    }

    public void creerFormulaireAjout() {
        this.activePanel = this.formulaireAjoutPanel;
        addLabel(formulaireAjoutPanel, titreLabel);
        addLabel(formulaireAjoutPanel, descriptionLabel);
        addLabel(formulaireAjoutPanel, dateLabel);
    }
}
