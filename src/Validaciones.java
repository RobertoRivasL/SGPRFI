import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validaciones {
    public boolean validarNombreApellido(String info) {
        return info.length() >= 10 && info.length() <= 50;
    }

    public boolean validarFechaNacimiento(String fecha) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    public boolean validarTelefono(int telefono) {
        return telefono <= 99999999 && telefono >= 10000000;
    }

    public boolean validarRut(int rut) {
        return rut >= 1000000 && rut <= 99999999;
    }

    public boolean validarAfp(String afp) {
        return afp.length() > 3 && afp.length() <= 30;
    }

    public boolean validarSistemaSalud(int salud) {
        if (salud == 1) {
            return true;
        } else return salud == 2;
    }

    public boolean validarDireccion(String direccion) {
        return direccion.length() <= 70;
    }

    public boolean validarComuna(String comuna) {
        return comuna.length() <= 50;
    }

    public boolean validarEdad(int edad) {
        return edad >= 0 && edad < 150;
    }

    public boolean validarTitulo(String titulo) {
        return titulo.length() >= 10 && titulo.length() <= 50;
    }

    public boolean validarFechaingreso(String fechain) {
        return fechain.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    public boolean validarArea(String area) {
        return area.length() >= 5 && area.length() <= 20;
    }

    public boolean validarIdentificador(int identificador) {
        return identificador != 0;
    }

    public boolean validarDia(String dia) {
        String[] diasPermitidos = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};
        for (String diaPermitido : diasPermitidos) {
            if (diaPermitido.equalsIgnoreCase(dia)) {
                return true;
            }
        }
        return false;
    }

    public boolean validarHora(String hora) {
        String horaRegex = "^([01]?[0-9]|2[0-3]):[0-5][0-9]$";
        Pattern pattern = Pattern.compile(horaRegex);
        Matcher matcher = pattern.matcher(hora);
        return matcher.matches();
    }

    public boolean validarLugar(String lugar) {
        return lugar.length() >= 10 && lugar.length() <= 50;
    }

    public boolean validarDuracion(int duracion) {
        return duracion <= 70;
    }

    public boolean validarCantidadAsistentes(int cantidadAsistentes) {
        return cantidadAsistentes < 1000;
    }

    public boolean validarInfo(String info) {
        return info.length() <= 100;
    }

    public String validarEstado(int estado) {
        if (estado == 1) {
            return "Sin Problemas";
        } else if (estado == 2) {
            return "Con observaciones";
        } else {
            return "No aprueba";
        }
    }

    public boolean validarOpcionMenu(int opcion) {
        return opcion >= 1 && opcion <= 9;
    }
}