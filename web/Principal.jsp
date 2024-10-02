import java.util.Scanner;

/**
* Clase principal de la aplicación.
* Muestra un menú interactivo para realizar varias operaciones.
*/
public class Principal {

/**
* Método principal que arranca la aplicación.
* @param args argumentos de la línea de comandos.
*/
public static void main(String[] args){
Scanner leer = new Scanner(System.in);
Contenedor contenedor = new Contenedor(); // Crear instancia de la clase Contenedor

int op = 0;
// Bucle principal para mostrar el menú y realizar operaciones según la opción elegida.
do {
System.out.println("----- MENÚ PRINCIPAL -----");
System.out.println("1. Almacenar cliente");
System.out.println("2. Almacenar profesional");
System.out.println("3. Almacenar administrativo");
System.out.println("4. Almacenar capacitación");
System.out.println("5. Eliminar usuario");
System.out.println("6. Listar usuarios");
System.out.println("7. Listar usuarios por tipo");
System.out.println("8. Listar capacitaciones");
System.out.println("9. Salir");


// Solicita al usuario que ingrese una opción.
System.out.print("Ingrese una opcion: ");
op = leer.nextInt();
if (!validaciones.validarOpcionMenu(op)) {
System.out.println("Opción inválida. Intente nuevamente.");
continue;
}

// Realiza una acción basada en la opción seleccionada por el usuario.
switch (op) {
case 1 -> contenedor.almacenarCliente();
case 2 -> contenedor.almacenarProfesional();
case 3 -> contenedor.almacenarAdministrativo();
case 4 -> contenedor.almacenarCapacitacion();
case 5 -> contenedor.eliminarUsuario();
case 6 -> contenedor.listarUsuarios();
case 7 -> contenedor.listarUsuariosTipo();
case 8 -> contenedor.listarCapacitaciones();
case 9 -> System.out.println("¡Hasta luego!");
default -> System.out.println("Opción inválida. Intente nuevamente.");
}
System.out.println();
} while (op != 9);
}
}



