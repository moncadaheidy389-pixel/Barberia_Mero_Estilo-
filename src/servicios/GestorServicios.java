package servicios;

import modelos.Servicio;
import java.util.ArrayList;
import java.util.List;

public class GestorServicios {
    private List<Servicio> listaServicios;

    public GestorServicios() {
        listaServicios = new ArrayList<>();
        cargarDatosPrueba();
    }

    private void cargarDatosPrueba() {
        listaServicios.add(new Servicio("Corte de cabello", 25000, 20));
        listaServicios.add(new Servicio("Afeitado", 15000, 15));
        listaServicios.add(new Servicio("Corte y barba", 35000, 35));
    }

    public boolean hayServicios() {
        return !listaServicios.isEmpty();
    }

    public void mostrarCatalogo() {
        if (!hayServicios()) {
            System.out.println("No hay servicios registrados.");
            return;
        }

        System.out.println("\n===== CATÁLOGO DE SERVICIOS =====");
        System.out.printf("%-25s %-10s %-15s%n", "NOMBRE", "PRECIO", "DURACIÓN");
        System.out.println("------------------------------------------------");
        for (Servicio s : listaServicios) {
            System.out.printf("%-25s $%-9.0f %-12d min%n",
                s.getNombre(), s.getPrecio(), s.getDuracionMinutos());
        }
        System.out.println("----------------------------------------------");
    }
}