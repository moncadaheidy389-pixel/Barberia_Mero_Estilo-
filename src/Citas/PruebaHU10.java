package Citas;

public class PruebaHU10 {
public static void main(String[] args) {
GestorCitas gestor = new GestorCitas();

// Citas del cliente 12345
gestor.agregarCita(new Cita(
1, "12345", "25/10/2026", "10:00",
"Corte clásico", "Andrés", "PENDIENTE"
));

gestor.agregarCita(new Cita(
2, "12345", "28/10/2026", "14:00",
"Barba", "Carlos", "ATENDIDA"
));

// Cita de otro cliente
gestor.agregarCita(new Cita(
3, "67890", "26/10/2026", "11:00",
"Corte degradado", "Juan", "PENDIENTE"
));

// Consultar las citas del cliente 12345
gestor.mostrarMisCitas("12345");

System.out.println("\n-- HU11; CANCELAR CITA ---");
gestor.cancelarCita(1, "12345");

System.out.println("\n--- HU10: CONSULTAR MIS CITAS ---");
gestor.mostrarMisCitas("12345");
}
}
