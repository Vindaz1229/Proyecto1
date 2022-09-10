package Proyecto.Graphics.Empleados;

import Proyecto.Logic.Empleado;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Model extends java.util.Observable {
    List<Empleado> empleados;
    public Model(){
        this.setEmpleados(new ArrayList<Empleado>());
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }
    @Override
    public void addObserver(Observer o){
        super.addObserver(o);
        commit();
    }

    public void commit() {
        setChanged();
        notifyObservers(null);
    }
}
