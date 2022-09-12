package Proyecto.Graphics.Empleado;

import javax.swing.*;

public class View {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton guardarButton;
    private JButton cancelarButton;
    private JLabel mapGoesHereLabel;
    private JPanel panel;

    public JPanel getPanel(){
        return panel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        mapGoesHereLabel  = new JLabel(new ImageIcon("mapa.png"));
    }
}
