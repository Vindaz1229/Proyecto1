package Proyecto.Graphics.Empleado;

import Proyecto.Logic.Empleado;

import javax.management.StringValueExp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class View implements Observer {
    private JTextField cedulaTextField;
    private JTextField nombreTextField;
    private JTextField telefonoTextField;
    private JTextField salarioTextField;
    private JTextField sucursalTextField;
    private JButton guardarButton;
    private JButton cancelarButton;
    private JLabel mapGoesHereLabel;
    private JPanel panel;
    private Model model;
    private Controller controller;


    public View() {
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               try {
                   controller.add();
                   JOptionPane.showMessageDialog(guardarButton, "¡Datos guardados exitosamente!");
                   controller.setDefaultTextForTextField();
                   controller.getFrame().dispose();
                   controller.getEmpleadosController().buscar("");
               }
               catch (Exception exception){
                   JOptionPane.showMessageDialog(guardarButton,"Datos Incorrectos.");
               }

            }
        });
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.getFrame().dispose();
                controller.setDefaultTextForTextField();
            }
        });
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public JPanel getPanel(){
        return panel;
    }

    public JTextField getCedulaTextField() {
        return cedulaTextField;
    }

    public JTextField getNombreTextField() {
        return nombreTextField;
    }

    public JTextField getTelefonoTextField() {
        return telefonoTextField;
    }

    public JTextField getSalarioTextField() {
        return salarioTextField;
    }

    public JTextField getSucursalTextField() {
        return sucursalTextField;
    }

    public void setCedulaTextField(JTextField cedulaTextField) {
        this.cedulaTextField = cedulaTextField;
    }

    public void setNombreTextField(JTextField nombreTextField) {
        this.nombreTextField = nombreTextField;
    }

    public void setTelefonoTextField(JTextField telefonoTextField) {
        this.telefonoTextField = telefonoTextField;
    }

    public void setSalarioTextField(JTextField salarioTextField) {
        this.salarioTextField = salarioTextField;
    }

    public void setSucursalTextField(JTextField sucursalTextField) {
        this.sucursalTextField = sucursalTextField;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        mapGoesHereLabel  = new JLabel(new ImageIcon("mapa.png"));
    }
    public void load(Empleado emp){
        System.out.println("Im here x3");
        this.getCedulaTextField().setText(emp.getCedula());
        this.getCedulaTextField().setText(emp.getCedula());
        this.getTelefonoTextField().setText(String.valueOf(emp.getTelefono()));
        this.getSalarioTextField().setText(String.valueOf(emp.getSalario()));
    }
    @Override
    public void update(Observable o, Object arg) {

    }
}
