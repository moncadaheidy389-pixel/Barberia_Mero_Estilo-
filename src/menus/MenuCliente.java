package menus;

import utilidades.Validador;
import servicios.GestorServicios;
import java.util.Scanner;

public class MenuCliente {
    private GestorServicios gestorServicios;

    public MenuCliente() {
        gestorServicios = new GestorServicios();
    }

    public void mostrar(Scanner sc) {
        int opcion;
        do {
            System.out.println("\n==== MENÚ CLIENTE ====");
            System.out.println("1. Consultar servicios y precios");
            System.out.println("2. Agendar cita");
            System.out.println("3. Mis citas");
            System.out.println("4. Volver al menú principal");
            System.out.println("------------------------");

            opcion = Validador.leerEnteroEnRango(sc, "Elige una opción: ", 1, 4);

            switch (opcion) {
                case 1:
                    gestorServicios.mostrarCatalogo();
                    break;
                case 2:
                    System.out.println("→ Agendar cita (en desarrollo)");
                    break;
                case 3:
                    System.out.println("→ Mis citas (en desarrollo)");
                    break;
                case 4:
                    System.out.println("→ Volviendo...");
                    break;
            }
        } while (opcion != 4);
    }
}