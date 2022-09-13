package Proyecto.Graphics.Empleado;

import Proyecto.Logic.Empleado;
import Proyecto.Logic.Gestion;

import javax.swing.*;

public class Controller {
    Model model;
    View view;
    JFrame frame;
    Proyecto.Graphics.Empleados.Controller empleadosController;
    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public void setEmpleadosController(Proyecto.Graphics.Empleados.Controller empleadosController) {
        this.empleadosController = empleadosController;
    }

    public Proyecto.Graphics.Empleados.Controller getEmpleadosController() {
        return empleadosController;
    }

    public JFrame getFrame() {
        return frame;
    }

    public Controller(Model model, View view) {
        model.setEmpleadoList(Gestion.instance().getData().getEmpleados());
        this.model = model;
        this.view = view;


        view.setModel(model);
        view.setController(this);
    }
    public void load(Empleado emp){
        view.load(emp);
    }
    public void add(){
        Empleado emp = Gestion.instance().crearEmpleado(view.getCedulaTextField().getText().toString(),view.getNombreTextField().getText().toString(),
                Integer.parseInt(view.getTelefonoTextField().getText().toString()),Double.parseDouble(view.getSalarioTextField().getText().toString()),null);
        for (Empleado empleado: model.getEmpleadoList()){
            if (emp.getCedula().equals(empleado.getCedula())){
                System.out.println("Cedulas Iguales");
                empleado.setCedula(emp.getCedula());
                empleado.setNombre(emp.getNombre());
                empleado.setTelefono(emp.getTelefono());
                empleado.setSalario(emp.getSalario());
                empleado.setSucursal(emp.getSucursal());
                return;
            }
        }
        model.getEmpleadoList().add(emp);
    }
    public void setDefaultTextForTextField(){
        view.getCedulaTextField().setText(model.setDefaultTextForTextField().getText());
        view.getNombreTextField().setText(model.setDefaultTextForTextField().getText());
        view.getTelefonoTextField().setText(model.setDefaultTextForTextField().getText());
        view.getSalarioTextField().setText(model.setDefaultTextForTextField().getText());
        view.getSucursalTextField().setText(model.setDefaultTextForTextField().getText());

    }
    public void setCustomizedTextForTextField(Empleado emp){
        String [] stringArray = model.setCustomizedTextForTextField(emp);
        view.getCedulaTextField().setText(stringArray[0]);
        view.getNombreTextField().setText(stringArray[1]);
        view.getTelefonoTextField().setText(stringArray[2]);
        view.getSalarioTextField().setText(stringArray[3]);
        view.getSucursalTextField().setText(stringArray[4]);
    }
    public View getView(){
        return view;
    }
}
