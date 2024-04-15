//------------------------------------ OBJETO TICKET --------------------------------------
import java.io.Serializable;

public class Ticket implements Serializable{
    public static String getCliente;
    public static int getIdCliente;
    public static int getIdCompra;
    private String idViaje;
    private String origen;
    private String destino;
    private String fecha;
    private String hora;
    private int precio;
    private String matriculaBus;

    public Ticket(String idViaje, String origen, String destino, String fecha, String hora, String matriculaBus, int precio) {
        this.idViaje=idViaje;
        this.origen=origen;
        this.destino=destino;
        this.fecha=fecha;
        this.hora=hora;
        this.precio=precio;
        this.matriculaBus=matriculaBus;
    }

    public String getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(String idViaje) {
        this.idViaje = idViaje;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMatriculaBus() {
        return matriculaBus;
    }

    public void setMatriculaBus(String matriculaBus) {
        this.matriculaBus = matriculaBus;
    }

}