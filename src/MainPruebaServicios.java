import servicios.GestorServicios;
public class MainPruebaServicios {
    public static void main(String[] args) {
        // 1. Creamos una instancia de nuestro gestor de servicios
        GestorServicios gestor = new GestorServicios();

        System.out.println("--- PRUEBA 1: Intentar registrar un servicio con precio en cero (Debe fallar) ---");
        gestor.registrarServicio("Corte Clásico", 0.0, 30);

        System.out.println("\n--- PRUEBA 2: Intentar registrar un servicio con duración negativa (Debe fallar) ---");
        gestor.registrarServicio("Barba Completa", 15000.0, -10);

        System.out.println("\n--- PRUEBA 3: Registrar servicios válidos ---");
        gestor.registrarServicio("Corte Clásico", 20000.0, 30);
        gestor.registrarServicio("Afeitado de Barba", 15000.0, 20);

        System.out.println("\n--- PRUEBA 4: Consultar el catálogo de servicios ---");
        gestor.listarServicios();
    }
}
