package Proyecto.Graphics.Empleados;

import Proyecto.Application;
import Proyecto.Logic.Empleado;
import Proyecto.Logic.Gestion;

import javax.swing.*;
import java.util.List;

public class Controller {
    Proyecto.Graphics.Empleado.Controller controllerEmpleado;
    View view;
    Model model;

    public Controller(View view, Model model, Proyecto.Graphics.Empleado.Controller controllerEmpleado) {
        model.setEmpleados(Gestion.instance().empleadosSearch(""));
        this.view = view;
        this.model = model;
        this.controllerEmpleado = controllerEmpleado;
        view.setController(this);
        view.setModel(model);
    }

    public void buscar(String filtro){
        List<Empleado> rows = Gestion.instance().empleadosSearch(filtro);
        model.setEmpleados(rows);
        model.commit();
        //System.out.println("Estoy Buscando");
    }

    public boolean add(){
        JFrame frame = new JFrame();
        frame.add(controllerEmpleado.getView().getPanel());
        frame.setVisible(true);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        controllerEmpleado.setFrame(frame);
        controllerEmpleado.setEmpleadosController(this);
        return true;
    }
    public boolean edit(String cedula){
        add();
        controllerEmpleado.setCustomizedTextForTextField(Gestion.instance().getEmpleadoFromTable(cedula));
        return true;
    }
    public void remove(String cedula){
        Gestion.instance().remove(cedula);
    }
    public void show(){
        Application.window.setContentPane(view.getPanel());
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }
}
