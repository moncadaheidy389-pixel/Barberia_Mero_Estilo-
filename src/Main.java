import modelos.Barbero;
import modelos.Cliente;
import modelos.Servicio;
import modelos.Cita;
import servicios.GestorCitas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorCitas gestor = new GestorCitas();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        // ✅ Agregado el 4to dato que piden los constructores
        Barbero barbero1 = new Barbero("B001", "Carlos", "Corte y Barba");
        Cliente cliente1 = new Cliente("C101", "Sara", "3109876543", "1006543210");
        Servicio servicio1 = new Servicio("Corte clásico", 25000, 30);

        do {
            System.out.println("\n=== BARBERÍA MERO ESTILO ===");
            System.out.println("1. Reservar cita");
            System.out.println("2. Consultar agenda general");
            System.out.println("3. Marcar cita como atendida");
            System.out.println("4. Consultar ingresos");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese ID de la cita (solo número): ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese Fecha y Hora (ej: 2026-10-25 10:00): ");
                    String fecha = scanner.nextLine();

                    Cita nueva = new Cita(id, cliente1, barbero1, servicio1, fecha, "Pendiente");
                    gestor.reservarCita(nueva);
                    break;

                case 2:
                    gestor.consultarAgendaGeneral();
                    break;

                case 3:
                    System.out.print("Ingrese el ID de la cita a atender (solo número): ");
                    int idAtender = scanner.nextInt();
                    scanner.nextLine();
                    gestor.marcarComoAtendida(idAtender);
                    break;

                case 4:
                    gestor.consultarIngresos();
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}