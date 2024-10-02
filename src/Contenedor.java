import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contenedor {

    //Atributos

    List<Asesoria> listaAsesoria = new ArrayList<>(); // Lista de la interfaz asesoria
    List<Capacitacion> listaCapacitacion = new ArrayList<>(); //Lista de objetos de la clase Capacitación
    Validaciones validar = new Validaciones(); // Objeto para validar
    //Métodos

    // Método para almacenar un cliente en la lista de asesorias
    public void almacenarCliente() {

        Scanner leer = new Scanner(System.in);
        System.out.println("----- ALMACENAR CLIENTE -----");
        System.out.print("Ingrese su nombre Usuario: ");
        String nombreUsuario = leer.nextLine();

        while (!validar.validarNombreApellido(nombreUsuario)) {
            System.out.print("Ingrese nombre Usuario Correcto ( minimo 10 caracteres): ");
            nombreUsuario = leer.nextLine();
        }

        System.out.print("Ingrese su fecha de nacimiento DD/MM/AA: ");
        String fechaNacimiento = leer.nextLine();

        while (!validar.validarFechaNacimiento(fechaNacimiento)) {
            System.out.print("Ingrese fecha de Nacimiento Correcta: ");
            fechaNacimiento = leer.nextLine();
        }

        // Validador

        System.out.print("Ingrese su Run de Usuario (8 digitos): ");
        int run = leer.nextInt();

        while (!validar.validarRut(run)) {
            System.out.print("Ingrese un run Correcto (8 caracteres): ");
            run = leer.nextInt();
        }

        System.out.print("Ingrese el rut Empresa: ");
        int rut = leer.nextInt();

        while (!validar.validarRut(rut)) {
            System.out.print("Ingrese un rut Correcto (8 numeros): ");
            rut = leer.nextInt();
        }

        leer = new Scanner(System.in);
        System.out.print("Ingrese los Nombres: ");
        String nombres = leer.nextLine();

        while (!validar.validarNombreApellido(nombres)) {
            System.out.print("Ingrese nombre Correcto (minimo 10 caracteres): ");
            nombres = leer.nextLine();
        }

        System.out.print("Ingrese los Apellidos: ");
        String apellidos = leer.nextLine();

        while (!validar.validarNombreApellido(apellidos)) {
            System.out.print("Ingrese apellido Correcto (minimo 10 caracteres): ");
            apellidos = leer.nextLine();
        }

        System.out.print("Ingrese su telefono: ");
        int telefono = leer.nextInt();

        while (!validar.validarTelefono(telefono)) {
            System.out.print("Ingrese telefono Correcto (8 numeros): ");
            telefono = leer.nextInt();
        }

        leer = new Scanner(System.in);
        System.out.print("Ingrese su Afp: ");
        String afp = leer.nextLine();

        while (!validar.validarAfp(afp)) {
            System.out.print("Ingrese afp Correcta: ");
            afp = leer.nextLine();
        }

        System.out.print("Ingrese su sistema de Salud | 1).- Fonasa 2).- Isapre : ");
        int salud = leer.nextInt();


        while (!validar.validarSistemaSalud(salud)) {
            System.out.print("Ingrese una opcion Correcta | 1).- Fonasa 2).- Isapre: ");
            salud = leer.nextInt();
        }

        leer = new Scanner(System.in);
        System.out.print("Ingrese su direccion: ");
        String direccion = leer.nextLine();

        while (!validar.validarDireccion(direccion)) {
            System.out.print("Ingrese direccion Correcta: ");
            direccion = leer.nextLine();
        }
        System.out.print("Ingrese su comuna: ");
        String comuna = leer.nextLine();

        while (!validar.validarComuna(comuna)) {
            System.out.print("Ingrese comuna Correcta: ");
            comuna = leer.nextLine();
        }

        System.out.print("Ingrese su edad: ");
        int edad = leer.nextInt();

        while (!validar.validarEdad(edad)) {
            System.out.print("Ingrese edad Correcta: ");
            edad = leer.nextInt();
        }

        Cliente cliente = new Cliente(nombreUsuario, fechaNacimiento, run, rut, nombres, apellidos, telefono, afp, salud, direccion, comuna, edad);

        this.listaAsesoria.add(cliente);

        System.out.println("Cliente almacenado exitosamente.");
    }

    // Método para almacenar un profesional en la lista de asesorias
    public void almacenarProfesional() {
        Scanner leer = new Scanner(System.in);
        System.out.println("----- ALMACENAR PROFESIONAL -----");
        System.out.print("Ingrese su nombre: ");
        String nombre = leer.nextLine();

        while (!validar.validarNombreApellido(nombre)) {
            System.out.print("Ingrese nombre Correcto (minimo 10 caracteres): ");
            nombre = leer.nextLine();
        }

        System.out.print("Ingrese su fecha de nacimiento DD/MM/AA: ");
        String fechaNacimiento = leer.nextLine();

        while (!validar.validarFechaNacimiento(fechaNacimiento)) {
            System.out.print("Ingrese fecha de Nacimiento Correcta: ");
            fechaNacimiento = leer.nextLine();
        }

        System.out.print("Ingrese su Run: ");
        int run = leer.nextInt();

        while (!validar.validarRut(run)) {
            System.out.print("Ingrese Run Correcto (8 numeros): ");
            run = leer.nextInt();
        }

        leer = new Scanner(System.in);
        System.out.print("Ingrese su titulo profesional: ");
        String titulo = leer.nextLine();

        while (!validar.validarTitulo(titulo)) {
            System.out.print("Ingrese titulo Correcto: ");
            titulo = leer.nextLine();
        }

        System.out.print("Ingrese fecha de ingreso DD/MM/AAAA: ");
        String fechaIngreso = leer.nextLine();

        while (!validar.validarFechaingreso(fechaIngreso)) {
            System.out.print("Ingrese fecha de ingreso Correcta DD/MM/AAAA: ");
            fechaIngreso = leer.nextLine();
        }

        Profesional profesional = new Profesional(nombre, fechaNacimiento, run, titulo, fechaIngreso);

        this.listaAsesoria.add(profesional);

        System.out.println("Profesional almacenado exitosamente.");
    }

    // Método para almacenar un administrativo en la lista de asesorias
    public void almacenarAdministrativo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("----- ALMACENAR ADMINISTRATIVO -----");
        System.out.print("Ingrese su nombre: ");
        String nombre = leer.nextLine();

        while (!validar.validarNombreApellido(nombre)) {
            System.out.print("Ingrese nombre Correcto (minimo 10 caracteres): ");
            nombre = leer.nextLine();
        }

        System.out.print("Ingrese su fecha de nacimiento DD/MM/AA: ");
        String fechaNacimiento = leer.nextLine();

        while (!validar.validarFechaNacimiento(fechaNacimiento)) {
            System.out.print("Ingrese fecha de Nacimiento Correcta: ");
            fechaNacimiento = leer.nextLine();
        }

        System.out.print("Ingrese su Run: ");
        int run = leer.nextInt();

        while (!validar.validarRut(run)) {
            System.out.print("Ingrese Run Correcto (8 numeros): ");
            run = leer.nextInt();
        }

        leer = new Scanner(System.in);
        System.out.print("Ingrese su Area: ");
        String area = leer.nextLine();

        while (!validar.validarArea(area)) {
            System.out.print("Ingrese area Correcta: ");
            area = leer.nextLine();
        }

        System.out.print("Ingrese su Experiencia Previa: ");
        String expPrevia = leer.nextLine();

        while (!validar.validarInfo(expPrevia)) {
            System.out.print("Ingrese Experiencia previa Correcta: ");
            expPrevia = leer.nextLine();
        }

        Administrativo administrativo = new Administrativo(nombre, fechaNacimiento, run, area, expPrevia);

        this.listaAsesoria.add(administrativo);

        System.out.println("Administrativo almacenado exitosamente.");
    }

    // Método para almacenar una capacitación en la lista de asesorias
    public void almacenarCapacitacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("----- ALMACENAR CAPACITACIÓN -----");
        System.out.print("Ingrese su Identificador: ");
        int identificador = leer.nextInt();

        while (!validar.validarIdentificador(identificador)) {
            System.out.print("Ingrese identificador Correcto: ");
            identificador = leer.nextInt();
        }

        System.out.print("Ingrese rut cliente: ");
        int rutCliente = leer.nextInt();

        while (!validar.validarRut(rutCliente)) {
            System.out.print("Ingrese rut cliente Correcto (8 numeros): ");
            rutCliente = leer.nextInt();
        }

        leer = new Scanner(System.in);
        System.out.print("Ingrese dia: ");
        String dia = leer.nextLine();

        while (!validar.validarDia(dia)) {
            System.out.print("Ingrese dia correcto valor permitido entre “lunes” y “domingo”: ");
            dia = leer.nextLine();
        }
        System.out.print("Ingrese hora HH/MM: ");
        String hora = leer.nextLine();

        while (!validar.validarHora(hora)) {
            System.out.print("Ingrese hora correcta HH/MM: ");
            hora = leer.nextLine();
        }

        System.out.print("Ingrese lugar: ");
        String lugar = leer.nextLine();

        while (!validar.validarLugar(lugar)) {
            System.out.print("Ingrese lugar correcto: ");
            lugar = leer.nextLine();
        }
        System.out.print("Ingrese duracion: ");
        int duracion = leer.nextInt();

        while (!validar.validarDuracion(duracion)) {
            System.out.print("Ingrese duracion Correcta: ");
            duracion = leer.nextInt();
        }

        System.out.print("Ingrese la cantidad de asistentes: ");
        int cantidadAsistentes = leer.nextInt();

        while (!validar.validarCantidadAsistentes(cantidadAsistentes)) {
            System.out.print("Ingrese cantidad asistentes Correcta: ");
            cantidadAsistentes = leer.nextInt();
        }

        Capacitacion capacitacion = new Capacitacion(identificador, rutCliente, dia, hora, lugar, duracion, cantidadAsistentes);

        this.listaCapacitacion.add(capacitacion);

        System.out.println("Capacitación almacenada exitosamente.");
    }


    //Método para eliminar un usuario según su rut
    public void eliminarUsuario() {
        Scanner leer = new Scanner(System.in);
        System.out.println("----- ELIMINAR USUARIO -----");
        System.out.print("Ingrese el RUN del usuario a eliminar: ");
        int run = leer.nextInt();

        for (Asesoria asesoria : listaAsesoria) {
            if (asesoria instanceof Usuario && ((Usuario) asesoria).getRun() == run) {
                listaAsesoria.remove(asesoria);
                System.out.println("Usuario eliminado exitosamente.");
                break;
            } else {
                System.out.println("No se encontró ningún usuario con ese RUN.");
            }
        }
    }

    //Método para listar a todos los usuarios: clientes, profesionales y administrativos.
    public void listarUsuarios() {
        System.out.println("----- LISTAR USUARIOS -----");

        for (Asesoria asesoria : listaAsesoria) {

            if (asesoria instanceof Cliente) {
                System.out.println("Cliente: ");
                System.out.println("----------------");
                asesoria.analizarUsuario();
            } else if (asesoria instanceof Profesional) {
                System.out.println("Profesional: ");
                System.out.println("----------------");
                asesoria.analizarUsuario();
            } else if (asesoria instanceof Administrativo) {
                System.out.println("Administrativo: ");
                System.out.println("----------------");
                asesoria.analizarUsuario();
            }

        }
    }

    //Método para listar a usuarios según su tipo: clientes, profesionales y administrativos.
    public void listarUsuariosTipo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("----- LISTAR USUARIOS POR TIPO -----");
        System.out.println("Tipos de usuario: ");
        System.out.println("1. Cliente");
        System.out.println("2. Profesional");
        System.out.println("3. Administrativo");
        System.out.print("Ingrese el tipo de usuario: ");
        int tipoUsuario = leer.nextInt();
        System.out.println("-------------------------------");


        for (Asesoria asesoria : listaAsesoria) {
            if (asesoria instanceof Cliente && tipoUsuario == 1) {
                System.out.println("Cliente: ");
                System.out.println("----------------");
                asesoria.analizarUsuario();
            } else if (asesoria instanceof Profesional && tipoUsuario == 2) {
                System.out.println("Profesional: ");
                System.out.println("----------------");
                asesoria.analizarUsuario();
            } else if (asesoria instanceof Administrativo && tipoUsuario == 3) {
                System.out.println("Administrativo: ");
                System.out.println("----------------");
                asesoria.analizarUsuario();
            }
        }
    }

    //Método para listar todas las capacitaciones
    public void listarCapacitaciones() {
        System.out.println("----- LISTAR CAPACITACIONES -----");
        for (Capacitacion capacitacion : listaCapacitacion) {
            System.out.println(capacitacion);
        }
    }

}
