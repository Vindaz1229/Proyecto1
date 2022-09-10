package Proyecto.Data;

import Proyecto.Logic.Empleado;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private List<Empleado> empleados;

    public Data() {
        empleados = new ArrayList<>();

        empleados.add(new Empleado("111", "Franklin Chang",0,null));
        empleados.add(new Empleado("222", "Sandra Cauffman",0,null));
        empleados.add(new Empleado("333", "Ivan Vargas",0,null));

        System.out.println("I'm here!");

    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
}
