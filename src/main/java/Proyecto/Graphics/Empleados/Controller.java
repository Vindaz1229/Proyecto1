package Proyecto.Graphics.Empleados;

import Proyecto.Application;
import Proyecto.Logic.Empleado;
import Proyecto.Logic.Gestion;

import java.util.List;

public class Controller {
    View view;
    Model model;

    public Controller(View view, Model model) {
        model.setEmpleados(Gestion.instance().empleadosSearch(""));
        this.view = view;
        this.model = model;
        view.setController(this);
        view.setModel(model);
    }

    public void buscar(String filtro){
        List<Empleado> rows = Gestion.instance().empleadosSearch(filtro);
        model.setEmpleados(rows);
        model.commit();
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
