package cliente;
public class PruebaClientes {
public static void main(String[] args) {
GestorClientes gestor = new GestorClientes();

// 1. Registrar un cliente
gestor.registrarCliente(
"Camilo Sánchez",
"12345",
"3001234567",
"Prefiere corte clásico"
);

// 2. Intentar registrar el mismo documento
gestor.registrarCliente(
"Carlos Pérez",
"12345",
"3109876543",
""
);

// 3. Listar clientes
gestor.listarClientes();

// 4. Consultar un cliente
gestor.consultarCliente("12345");

// 5. Actualizar sus datos
gestor.actualizarCliente(
"12345",
"Camilo Sánchez",
"3115555555",
"Prefiere corte degradado"
);

// 6. Consultar los datos actualizados
gestor.consultarCliente("12345");

// 7. Buscar un cliente inexistente
gestor.consultarCliente("99999");

// 8. Intentar registrar datos vacíos
gestor.registrarCliente("", "77777", "3000000000", "");
}
}