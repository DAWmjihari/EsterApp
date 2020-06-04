package esterapp;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import view.Login;

/**
 *
 * @author mjihari
 */
public class EsterApp {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error al aplicar el estilo al sistema", JOptionPane.ERROR_MESSAGE);
        }

        Login login_view = new Login();
        login_view.setVisible(true);
    }
}
