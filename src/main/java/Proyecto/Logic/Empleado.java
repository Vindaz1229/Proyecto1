package Proyecto.Logic;

public class Empleado {
    private String cedula;
    private String nombre;
    private int telefono;
    private double salario;
    private Sucursal sucursal;

    public Empleado(String cedula, String nombre, int telefono, double salario, Sucursal sucursal) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.salario = salario;
        this.sucursal = sucursal;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
