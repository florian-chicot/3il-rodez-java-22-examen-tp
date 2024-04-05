import gui.view.TacheView;

import javax.swing.*;

public class Launcher extends JFrame {

    public Launcher() {
        TacheView view = new TacheView();

        JFrame frame = new JFrame("Gestionnaire de tâches");
        frame.setSize(800, 600);
        frame.setContentPane(view.getActivePanel());
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Launcher::new);
    }
}
