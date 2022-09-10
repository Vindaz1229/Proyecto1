package Proyecto.Logic;

public class Sucursal {
    private String referencia;
    private String direccion;
    private double porcentajeZonaje;
    private Coordenada coordenada;


    public Sucursal(String referencia, String direccion, double porcentajeZonaje, Coordenada coordenada) {
        this.referencia = referencia;
        this.direccion = direccion;
        this.porcentajeZonaje = porcentajeZonaje;
        this.coordenada = coordenada;
    }
}
