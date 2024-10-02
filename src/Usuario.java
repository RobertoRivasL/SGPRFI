public class Usuario implements Asesoria {

    //Atributos
    private String nombre; // nombre de usuario
    private String fechaNacimiento; // Fecha de nacimiento del usuario
    private int run; // Run del usuario.


    //Constructores
    public Usuario() {
    }

    public Usuario(String nombre, String fechaNacimiento, int run) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
    }


    //Métodos getter and setter para los atributos correspondientes.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }


    //Método para mostrar edad del usuario
    public void mostrarEdad(int edad) {
        analizarUsuario();
        System.out.println("El usuario tiene " + edad + " años");
    }

    //Método toString para mostrar los datos de Usuario como cadena de texto
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", run='" + run + '\'' +
                '}';
    }

    //Método para mostrar nombre y run usuario
    @Override
    public void analizarUsuario() {
        System.out.println("Nombre de Usuario: " + this.nombre);
        System.out.println("Run: " + this.run);
    }
}
