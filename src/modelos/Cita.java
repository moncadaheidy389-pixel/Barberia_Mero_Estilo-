package modelos;

public class Cita {
    private int idCita;
    private Cliente cliente;
    private Barbero barbero;
    private Servicio servicio;
    private String fechaHora; // Ejemplo: "2026-10-25 10:00"
    private String estado;    // "Pendiente", "Atendida", "Cancelada"

    // Constructor vacío
    public Cita() {
    }

    // Constructor con parámetros
    public Cita(int idCita, Cliente cliente, Barbero barbero, Servicio servicio, String fechaHora) {
        this.idCita = idCita;
        this.cliente = cliente;
        this.barbero = barbero;
        this.servicio = servicio;
        this.fechaHora = fechaHora;
        this.estado = "Pendiente"; // Por regla de negocio, toda cita nueva nace como pendiente[cite: 8]
    }

    // Getters y Setters
    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Barbero getBarbero() {
        return barbero;
    }

    public void setBarbero(Barbero barbero) {
        this.barbero = barbero;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cita [ID=" + idCita + 
                ", Cliente=" + cliente.getNombre() + 
                ", Barbero=" + barbero.getNombre() + 
                ", Servicio=" + servicio.getNombreServicio() + 
                ", Fecha/Hora=" + fechaHora + 
                ", Estado=" + estado + "]";
    }
}