package Proyecto.Graphics.MainTabbedPane;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class View implements Observer {
    private JPanel panel1;
    private JTabbedPane tabbedPane;

    Controller controller;
    Model model;

    public void setController(Controller controller){ this.controller = controller; }

    public void setModel(Model model) {
        this.model = model;
    }

    public JTabbedPane getTabbedPane() {
        return tabbedPane;
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
