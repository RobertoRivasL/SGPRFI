public class Accidente {

    //Atributos

    private int idAcc; //Identificador cccidente
    private int rutCliente; //Rut cliente
    private String dia; //Día accidente
    private String hora; //Hora accidente
    private String lugar; //Lugar accidente
    private String origen; //Origen accidente
    private String consecuencias; //Consecuencias accidente

    //Constructores

    public Accidente() {
    }

    public Accidente(int idAcc, int rutCliente, String dia, String hora, String lugar, String origen, String consecuencias) {
        this.idAcc = idAcc;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.origen = origen;
        this.consecuencias = consecuencias;
    }

    //Métodos Getters y Setters: se proporcionan los métodos getter y setter para acceder y modificar los atributos de la clase Accidente.

    public int getIdAcc() {
        return idAcc;
    }

    public void setIdAcc(int idAcc) {
        this.idAcc = idAcc;
    }

    public int getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getConsecuencias() {
        return consecuencias;
    }

    public void setConsecuencias(String consecuencias) {
        this.consecuencias = consecuencias;
    }

    //Muestra los datos de la clase

    @Override
    public String toString() {
        return "Accidente{" +
                "idAcc=" + idAcc +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", origen='" + origen + '\'' +
                ", consecuencias='" + consecuencias + '\'' +
                '}';
    }
}
