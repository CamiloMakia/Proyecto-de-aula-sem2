//------------------------------------ OBJETO TICKET --------------------------------------
import java.io.Serializable;

public class Ticket implements Serializable{

    private int idCliente;
    private  String cliente;
    private String fecha;
    private int precio;
    private String horaTicket;
    private String matriculaBus;
    private int idCompra;


    public Ticket(String idViaje, String origen, String destino, String fecha, String hora, String matriculaBus, int precio, int idCliente, int idCompra, String cliente, String horaTicket) {
        this.fecha=fecha;
        this.horaTicket=horaTicket;
        this.precio=precio;
        this.matriculaBus=matriculaBus;
        this.cliente = cliente;
        this.idCliente = idCliente;

    }

    public String getFecha() {
        return fecha;
    }

    public int getPrecio() {
        return precio;
    }

    public String getMatriculaBus() {
        return matriculaBus;
    }

    public String getHoraTicket() {
        return horaTicket;
    }

    public void setHoraTicket(String horaTicket) {
        this.horaTicket = horaTicket;
    }

    public int getIdCompra() { return idCompra; }

    public String getDestino() {
        String destino = "", origen="";
        int idCliente = 0, idCompra=0;
        String cliente = "", hora="", idViaje="";
        Viaje viaje = new Viaje(idViaje, origen, destino, fecha, hora, matriculaBus, precio, idCliente, idCompra, cliente, horaTicket);
        return viaje.getDestino();
    }

    public String getOrigen() {
        String destino = "", origen="";
        int idCliente = 0, idCompra=0;
        String cliente = "", hora="", idViaje="";
        Viaje viaje = new Viaje(idViaje, origen, destino, fecha, hora, matriculaBus, precio, idCliente, idCompra, cliente, horaTicket);
        return origen;
    }

    public String getIdViaje() {
        String destino = "", origen="";
        int idCliente = 0, idCompra=0;
        String cliente = "", hora="", idViaje="";
        Viaje viaje = new Viaje(idViaje, origen, destino, fecha, hora, matriculaBus, precio, idCliente, idCompra, cliente, horaTicket);
        return viaje.getIdViaje(); }

    public String getHora() {
        String destino = "", origen="";
        int idCliente = 0, idCompra=0;
        String cliente = "", hora="", idViaje="";
        Viaje viaje = new Viaje(idViaje, origen, destino, fecha, hora, matriculaBus, precio, idCliente, idCompra, cliente, horaTicket);
        return viaje.getHora(); }

    public int getIdCliente() {
        return idCliente;
    }

    public String getCliente() {
        return cliente;
    }


    public int setIdCompra(int idCompra) {
        this.idCompra = idCompra;
        return this.idCompra;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setOrigen(String origen) {
        origen = origen;
    }

    public void setDestino(String destino) {
    }

    public void setFecha(String fecha) {
    }

    public void setHora(String hora) {
    }

    public void setMatriculaBus(String matriculaBus) {
    }

    public void setPrecio(int precio) {
    }

    public void setIdViaje(String dato) {
    }
}