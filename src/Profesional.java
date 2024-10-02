public class Profesional extends Usuario {

    // Atributos

    private String titulo;
    private String fechaIngreso;

    // Constructores

    public Profesional() {
    }

    public Profesional(String titulo, String fechaIngreso) {
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    public Profesional(String nombre, String fechaNacimiento, int run, String titulo, String fechaIngreso) {
        super(nombre, fechaNacimiento, run);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    // Métodos Getter y Setter para atributos de la clase Profesional

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    // Muestra los datos de la clase Usuario (Padre) y Profesional
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Titulo : " + this.titulo);
        System.out.println("Fecha de Ingreso : " + this.fechaIngreso);
        System.out.println(" ");
    }

    //Muestra los datos de la clase
    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                '}';
    }


}
