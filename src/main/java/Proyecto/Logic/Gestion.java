package Proyecto.Logic;

import Proyecto.Data.Data;

import java.util.List;
import java.util.stream.Collectors;


public class Gestion {
    private static Gestion instance;
    private Data data;
    public static Gestion instance(){
        if (instance == null ){
            instance = new Gestion();
        }
        return instance;
    }
    private Gestion (){ data = new Data(); }

    public Data getData() {
        return data;
    }

    public List<Empleado> empleadosSearch(String filtro){
        return data.getEmpleados().stream().filter(e->e.getNombre().contains(filtro)).collect(Collectors.toList());
    }
    public Empleado crearEmpleado(String cedula, String nombre, int telefono, Double salario, Sucursal sucursal){
        System.out.println("I'm here x2");
        return new Empleado(cedula,nombre,telefono,salario,null);
    }
    public void remove(String cedula){
        data.getEmpleados().remove(getEmpleadoFromTable(cedula));
    }
    public Empleado getEmpleadoFromTable(String cedula){
        for (Empleado emp : data.getEmpleados()){
            if(emp.getCedula().equals(cedula)){
                return emp;
            }
        }
        return null;
    }
}
