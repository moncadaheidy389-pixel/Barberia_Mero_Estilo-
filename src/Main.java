import modelos.*;
import servicios.GestorCitas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorCitas gestor = new GestorCitas();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        // Datos de prueba iniciales
        Barbero barbero1 = new Barbero(1, "Carlos");
        Cliente cliente1 = new Cliente(101, "Sara");
        Servicio servicio1 = new Servicio(1, "Corte clásico", 25000);

        do {
            System.out.println("\n=== BARBERÍA MERO ESTILO ===");
            System.out.println("1. Reservar cita (HU-09)");
            System.out.println("2. Consultar agenda general (HU-05)");
            System.out.println("3. Marcar cita como atendida (HU-12)");
            System.out.println("4. Consultar ingresos (HU-12)");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese ID de la cita: ");
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
                    System.out.print("Ingrese el ID de la cita a atender: ");
                    int idAtender = scanner.nextInt();
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
