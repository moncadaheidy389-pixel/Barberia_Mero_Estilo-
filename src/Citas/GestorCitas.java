package Citas;

import java.util.ArrayList;
import java.util.List;

public class GestorCitas {
private List<Cita> citas = new ArrayList<>();

public void agregarCita(Cita cita) {
citas.add(cita);
}

public List<Cita> consultarMisCitas(String documentoCliente) {
List<Cita> misCitas = new ArrayList<>();

for (Cita cita : citas) {
if (cita.getDocumentoCliente().equals(documentoCliente)) {
misCitas.add(cita);
}
}

return misCitas;
}

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
}
