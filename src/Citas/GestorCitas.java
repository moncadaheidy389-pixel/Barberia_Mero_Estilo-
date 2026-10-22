package Citas;

import java.util.ArrayList;
import java.util.List;

public class GestorCitas {
private List<Cita> citas = new ArrayList<>();

public void agregarCita(Cita cita) {
citas.add(cita);
}

// HU-10: Consultar las citas de un cliente
public List<Cita> consultarMisCitas(String documentoCliente) {
List<Cita> misCitas = new ArrayList<>();

for (Cita cita : citas) {
if (cita.getDocumentoCliente().equals(documentoCliente)) {
misCitas.add(cita);
}
}

return misCitas;
}

// HU-10: Mostrar las citas de un cliente
public void mostrarMisCitas(String documentoCliente) {
List<Cita> misCitas = consultarMisCitas(documentoCliente);

if (misCitas.isEmpty()) {
System.out.println("No tienes citas registradas.");
return;
}

System.out.println("\n===== MIS CITAS =====");

for (Cita cita : misCitas) {
System.out.println("------------------------");
System.out.println("Número: " + cita.getId());
System.out.println("Fecha: " + cita.getFecha());
System.out.println("Hora: " + cita.getHora());
System.out.println("Servicio: " + cita.getServicio());
System.out.println("Barbero: " + cita.getBarbero());
System.out.println("Estado: " + cita.getEstado());
}

System.out.println("------------------------");
}

// HU-11: Cancelar una cita pendiente del cliente
public boolean cancelarCita(int idCita, String documentoCliente) {
for (Cita cita : citas) {

if (cita.getId() == idCita
&& cita.getDocumentoCliente().equals(documentoCliente)) {

if (cita.getEstado().equalsIgnoreCase("PENDIENTE")) {
cita.setEstado("CANCELADA");

System.out.println("Cita cancelada correctamente.");
System.out.println("Fecha: " + cita.getFecha());
System.out.println("Hora: " + cita.getHora());
System.out.println("El horario puede quedar disponible.");

return true;
} else {
System.out.println(
"No se puede cancelar: la cita no está pendiente."
);
return false;
}
}
}

System.out.println(
"No se encontró esa cita para el cliente indicado."
);
return false;
}
}
