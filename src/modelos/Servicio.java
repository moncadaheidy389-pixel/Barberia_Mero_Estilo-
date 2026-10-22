package modelos;

public class Servicio {
    private String nombre;
    private double precio;
    private int duracionMinutos;

    public Servicio(String nombre, double precio, int duracionMinutos) {
        this.nombre = nombre;
        this.precio = precio;
        this.duracionMinutos = duracionMinutos;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getDuracionMinutos() { return duracionMinutos; }
}