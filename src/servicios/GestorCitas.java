package servicios;

import modelos.Cita;
import java.util.ArrayList;

public class GestorCitas {
    private ArrayList<Cita> listaCitas = new ArrayList<>();

    // HU-09: Reservar una cita (evitando cruces)
    public boolean reservarCita(Cita nuevaCita) {
        for (Cita c : listaCitas) {
            if (c.getBarbero().equalsIgnoreCase(nuevaCita.getBarbero()) &&
                c.getFecha().equals(nuevaCita.getFecha()) &&
                c.getHora().equals(nuevaCita.getHora()) &&
                !c.getEstado().equalsIgnoreCase("Cancelada")) {
                
                System.out.println("❌ Error: El barbero ya tiene una cita en este horario.");
                return false;
            }
        }
        listaCitas.add(nuevaCita);
        System.out.println("✅ Cita reservada con éxito. ID: " + nuevaCita.getId());
        return true;
    }

    // HU-05: Consultar la agenda general
    public void consultarAgendaGeneral() {
        System.out.println("\n--- AGENDA GENERAL DE CITAS ---");
        if (listaCitas.isEmpty()) {
            System.out.println("No hay citas registradas.");
            return;
        }
        for (Cita c : listaCitas) {
            System.out.println(c.toString());
        }
    }

    // HU-12 Parte A: Marcar cita como atendida
    public boolean marcarComoAtendida(int idCita) {
        for (Cita c : listaCitas) {
            if (c.getId() == idCita) {
                c.setEstado("Atendida");
                System.out.println("✅ Cita #" + idCita + " marcada como ATENDIDA.");
                return true;
            }
        }
        System.out.println("❌ Cita no encontrada.");
        return false;
    }

    // HU-12 Parte B: Consultar ingresos
    public void consultarIngresos() {
        double totalIngresos = 0;
        int contador = 0;
        for (Cita c : listaCitas) {
            if (c.getEstado().equalsIgnoreCase("Atendida")) {
                totalIngresos += c.getPrecioServicio(); // Asegúrate de usar el método que retorna el precio del servicio
                contador++;
            }
        }
        System.out.println("\n--- REPORTE DE INGRESOS ---");
        System.out.println("Citas atendidas: " + contador);
        System.out.println("Total de ingresos: $" + totalIngresos);
    }
}