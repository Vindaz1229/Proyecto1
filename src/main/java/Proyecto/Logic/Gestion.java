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

    public List<Empleado> empleadosSearch(String filtro){
        return data.getEmpleados().stream().filter(e->e.getNombre().contains(filtro)).collect(Collectors.toList());
    }
}
