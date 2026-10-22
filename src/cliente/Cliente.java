package cliente;
public class Cliente {
private String nombre;
private String documento;
private String telefono;
private String observaciones;

public Cliente(String nombre, String documento,
String telefono, String observaciones) {
setNombre(nombre);
setDocumento(documento);
setTelefono(telefono);
setObservaciones(observaciones);
}

public String getNombre() {
return nombre;
}

public void setNombre(String nombre) {
if (nombre == null || nombre.trim().isEmpty()) {
throw new IllegalArgumentException("El nombre es obligatorio.");
}
this.nombre = nombre.trim();
}

public String getDocumento() {
return documento;
}

public void setDocumento(String documento) {
if (documento == null || documento.trim().isEmpty()) {
throw new IllegalArgumentException("El documento es obligatorio.");
}
this.documento = documento.trim();
}

public String getTelefono() {
return telefono;
}

public void setTelefono(String telefono) {
if (telefono == null || telefono.trim().isEmpty()) {
throw new IllegalArgumentException("El teléfono es obligatorio.");
}
this.telefono = telefono.trim();
}

public String getObservaciones() {
return observaciones;
}

public void setObservaciones(String observaciones) {
this.observaciones = observaciones == null
? "" : observaciones.trim();
}

@Override
public String toString() {
return "Nombre: " + nombre
+ " | Documento: " + documento
+ " | Teléfono: " + telefono
+ " | Observaciones: "
+ (observaciones.isEmpty() ? "Ninguna" : observaciones);
}
}