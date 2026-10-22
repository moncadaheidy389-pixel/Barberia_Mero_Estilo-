package modelos;

public class Barbero {
    private String idBarbero;
    private String nombre;
    private String especialidad;

    // Constructor vacío
    public Barbero() {
    }

    // Constructor con parámetros
    public Barbero(String idBarbero, String nombre, String especialidad) {
        this.idBarbero = idBarbero;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    
    public String getIdBarbero() {
        return idBarbero;
    }

    public void setIdBarbero(String idBarbero) {
        this.idBarbero = idBarbero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Barbero [ID=" + idBarbero + ", Nombre=" + nombre + ", Especialidad=" + especialidad + "]";
    }
}
