public class Capacitacion {

    //Atributos
    private int identificador;  //Identificador de la capacitación
    private int rutCliente; // Rut del cliente
    private String dia; // Día de la semana de la capacitación
    private String hora; // Hora de la capacitación
    private String lugar; // Lugar de la Capacitación
    private int duracion; // Duración de la Capacitación
    private int cantidadAsistentes; // Cantidad de asistentes de la capacitación.

    public Capacitacion() {
    }

    //Constructores
    public Capacitacion(int identificador, int rutCliente, String dia, String hora, String lugar, int duracion,
                        int cantidadAsistentes) {
        this.identificador = identificador;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
    }

    //Métodos

    //Getter y Setter del atributo Identificador
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    //Getter y Setter del atributo rutCliente
    public int getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }

    //Getter y Setter del atributo Día
    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    //Getter y Setter del atributo Hora
    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    //Getter y Setter del atributo Lugar
    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    //Getter y Setter del atributo Duración
    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    //Getter y Setter del atributo cantidadAsistentes
    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public void setCantidadAsistentes(int cantidadAsistentes) {
        this.cantidadAsistentes = cantidadAsistentes;
    }


    //Método para mostrar detalles de la Capacitación como cadena de texto
    public String mostrarDetalle() {
        return "La capacitación será en " + this.lugar + " a las " + this.hora + " del día " + this.dia + ", y durará " +
                this.duracion + " minutos";
    }

    //Método toString para mostrar los datos de la Capacitación como cadena de texto
    @Override
    public String toString() {
        return "Capacitacion{" +
                "identificador=" + identificador +
                ", rutCliente=" + rutCliente +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", duracion=" + duracion +
                ", cantidadAsistentes=" + cantidadAsistentes +
                '}';
    }
}
