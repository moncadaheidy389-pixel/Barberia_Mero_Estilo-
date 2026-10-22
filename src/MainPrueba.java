
import servicios.GestorBarberos;

public class MainPrueba {
    public static void main(String[] args) {
        // 1. Creamos una instancia de nuestro gestor
        GestorBarberos gestor = new GestorBarberos();

        System.out.println("--- PRUEBA 1: Registro de barberos válidos ---");
        gestor.registrarBarbero("B01", "Carlos Pérez", "Corte clásico y barba");
        gestor.registrarBarbero("B02", "Andrés Gómez", "Estilos modernos y desvanecidos");

        System.out.println("\n--- PRUEBA 2: Intentar registrar un ID repetido (Debe fallar) ---");
        // Intentamos registrar a otro barbero pero usando el ID "B01" que ya existe
        gestor.registrarBarbero("B01", "Felipe Ruiz", "Diseños");

        System.out.println("\n--- PRUEBA 3: Consultar la lista de barberos ---");
        gestor.listarBarberos();
    }
}