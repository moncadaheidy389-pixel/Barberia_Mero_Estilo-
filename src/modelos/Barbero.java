package modelos;

public class Barbero {
    private String idBarbero;
    private String nombre;
    private String telefono;
    private String especialidad;  // ✅ Agregado

    public Barbero() {}

    // Constructor completo
    public Barbero(String idBarbero, String nombre, String telefono, String especialidad) {
        this.idBarbero = idBarbero;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // Getters
    public String getIdBarbero() { return idBarbero; }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; } // ✅ Faltaba

    // Setters
    public void setIdBarbero(String idBarbero) { this.idBarbero = idBarbero; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
}