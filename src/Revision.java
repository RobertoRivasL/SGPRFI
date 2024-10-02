public class Revision {

    //Atributos
    private int idRev; //Identificador de la revisión
    private int idVisita; //Identificador de la visita en terreno
    private String nombreRevision; //Identificador del nombre de la revisión
    private String detalle; // Detalles para la revisión
    private int estado; // Estado de la revisión: 1 (sin problemas), 2 (con observaciones), 3 (no aprueba).

    public Revision() {
    }

    //Constructores
    public Revision(int idRev, int idVisita, String nombreRevision, String detalle, int estado) {
        this.idRev = idRev;
        this.idVisita = idVisita;
        this.nombreRevision = nombreRevision;
        this.detalle = detalle;
        this.estado = estado;
    }

    //Métodos

    //Getter y Setter para el atributo Identificador
    public int getIdRev() {
        return idRev;
    }

    public void setIdRev(int idRev) {
        this.idRev = idRev;
    }

    //Getter y Setter para el atributo Identificador de la visita
    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    //Getter y Setter para el atributo Nombre
    public String getNombreRevision() {
        return nombreRevision;
    }

    public void setNombreRevision(String nombreRevision) {
        this.nombreRevision = nombreRevision;
    }

    //Getter y Setter para el atributo Detalle
    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    //Getter y Setter para el atributo Estado
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }


    //Método toString para mostrar los datos de la Revisión como cadena de texto
    @Override
    public String toString() {
        return "Revision{" +
                "idRev=" + idRev +
                ", nombreRevision='" + nombreRevision + '\'' +
                ", detalle='" + detalle + '\'' +
                ", estado=" + estado +
                '}';
    }
}
