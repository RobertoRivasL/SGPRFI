public class VisitaEnTerreno {

    //Atributos
    private int idVisita; //Identificador de visita en terreno
    private int rutCliente; // rut del cliente
    private String dia; // día de la visita en terreno
    private String hora; // hora de la visita en terreno
    private String lugar; // lugar de la visita en terreno
    private String comentarios; // comentarios de la visita en terreno

    public VisitaEnTerreno() {
    }

    //Constructores
    public VisitaEnTerreno(int idVisita, int rutCliente, String dia, String hora, String lugar, String comentarios) {
        this.idVisita = idVisita;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.comentarios = comentarios;
    }

    //Métodos

    //Getter y Setter para el atributo Identificador
    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    //Getter y Setter para el atributo rutCliente
    public int getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }

    //Getter y Setter para el atributo Día
    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    //Getter y Setter para el atributo Hora
    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    //Getter y Setter para el atributo lugar
    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    //Getter y Setter para el atributo Comentarios
    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    //Método toString para mostrar los datos de la Visita en Terreno como cadena de texto
    @Override
    public String toString() {
        return "VisitaEnTerreno{" +
                "idVisita=" + idVisita +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}
