public class Administrativo extends Usuario {

    //Atributos
    private String area; //Área del administrativo
    private String expPrevia; //Experiencia previa del administrativo

    //Constructores
    public Administrativo() {
    }

    public Administrativo(String area, String expPrevia) {
        this.area = area;
        this.expPrevia = expPrevia;
    }

    public Administrativo(String nombre, String fechaNacimiento, int run, String area, String expPrevia) {
        super(nombre, fechaNacimiento, run);
        this.area = area;
        this.expPrevia = expPrevia;
    }

    //Métodos

    //Getter y setter para el atributo Area
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    //Getter y setter para el atributo Experiencia Previa
    public String getExpPrevia() {
        return expPrevia;
    }

    public void setExpPrevia(String expPrevia) {
        this.expPrevia = expPrevia;
    }

    //Método toString para mostrar los datos de la clase Padre Usuario y
    // del Administrativo como cadena de texto
    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Área : " + this.area);
        System.out.println("Experiencia previa: " + this.expPrevia);
        System.out.println(" ");
    }

    //Método toString para mostrar los datos del Administrativo como cadena de texto
    @Override
    public String toString() {
        return "Administrativo{" +
                "area='" + area + '\'' +
                ", expPrevia='" + expPrevia + '\'' +
                '}';
    }


}
