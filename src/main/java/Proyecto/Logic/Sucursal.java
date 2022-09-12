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

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPorcentajeZonaje() {
        return porcentajeZonaje;
    }

    public void setPorcentajeZonaje(double porcentajeZonaje) {
        this.porcentajeZonaje = porcentajeZonaje;
    }

    public Coordenada getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(Coordenada coordenada) {
        this.coordenada = coordenada;
    }
}
