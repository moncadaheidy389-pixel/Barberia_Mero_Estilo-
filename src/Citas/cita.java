package Citas;

public class Cita {
private int id;
private String documentoCliente;
private String fecha;
private String hora;
private String servicio;
private String barbero;
private String estado;

public Cita(int id, String documentoCliente, String fecha,
String hora, String servicio, String barbero,
String estado) {
this.id = id;
this.documentoCliente = documentoCliente;
this.fecha = fecha;
this.hora = hora;
this.servicio = servicio;
this.barbero = barbero;
this.estado = estado;
}

public int getId() {
return id;
}

public String getDocumentoCliente() {
return documentoCliente;
}

public String getFecha() {
return fecha;
}

public String getHora() {
return hora;
}

public String getServicio() {
return servicio;
}

public String getBarbero() {
return barbero;
}

public String getEstado() {
return estado;
}

public void setEstado (String estado) {
    this.estado = estado;
}
}