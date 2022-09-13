package Proyecto.Graphics.Empleado;

import Proyecto.Logic.Empleado;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Model extends Observable {
    List<Empleado> empleadoList;
    public Model(){
        this.empleadoList = new ArrayList<>();
    }

    public void setEmpleadoList(List<Empleado> empleadoList) {
        this.empleadoList = empleadoList;
    }

    public List<Empleado> getEmpleadoList() {
        return empleadoList;
    }
    public void addObserver(Observable o){
        this.addObserver(o);
        commit(null);
    }
    public void commit(Object emp){
        setChanged();
        notifyObservers(emp);
    }
    public JTextField setDefaultTextForTextField(){
        return new JTextField("");
    }
    public String[] setCustomizedTextForTextField(Empleado empleado){
        return new String[]{empleado.getCedula(),empleado.getNombre(),
                String.valueOf(empleado.getTelefono()),String.valueOf(empleado.getSalario()),String.valueOf(empleado.getSucursal())};
    }

}
