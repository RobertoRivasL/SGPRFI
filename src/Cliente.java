public class Cliente extends Usuario {

    //Atributos
    private int rut; //Rut cliente
    private String nombres; //Nombres cliente
    private String apellidos; //Apellidos cliente
    private int telefono; //Teléfono cliente
    private String afp; //AFP cliente
    private int sistemaSalud; //Sistema de salud cliente
    private String direccion; //Direccion cliente
    private String comuna; //Comuna cliente
    private int edad; //Edad cliente

    //Constructores

    public Cliente() {

    }

    public Cliente(String nombre, String fechaNacimiento, int run, int rut, String nombres, String apellidos, int telefono, String afp, int sistemaSalud, String direccion, String comuna, int edad) {
        super(nombre, fechaNacimiento, run);
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }

    //Métodos Getter y Setter atributos de la clase Cliente

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public int getSistemaSalud() {
        return sistemaSalud;
    }

    public void setSistemaSalud(int sistemaSalud) {
        this.sistemaSalud = sistemaSalud;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    //Obtiene el nombre completo del cliente (nombres + apellidos)

    public String obtenerNombre() {
        return "Nombres: " + this.nombres + " Apellidos: " + this.apellidos;
    }


    // Muestra los datos de la clase Usuario (Padre) y Cliente
    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Direccion: " + this.direccion);
        System.out.println("Comuna: " + this.comuna);
        System.out.println(" ");
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "rut=" + rut +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono=" + telefono +
                ", afp='" + afp + '\'' +
                ", sistemaSalud=" + sistemaSalud +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                ", edad=" + edad +
                '}';
    }
    //Muestra los datos de la clase

    public String obtenerSistemaSalud(int salud) {
        if (salud == 1) {
            return "Fonasa";
        } else if (salud == 2) {
            return "Isapre";
        } else {
            return "Desconocido";
        }
    }

}
