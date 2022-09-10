package Proyecto.Graphics.MainTabbedPane;

import Proyecto.Application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    Model model;
    View view;

    public Controller(View view, Model model) {
        this.model = model;
        this.view = view;
        view.setModel(model);
        view.setController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.commit();
    }
    public void show(){
        Application.window.setContentPane(view.getTabbedPane());
    }
}
