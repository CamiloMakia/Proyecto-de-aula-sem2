public class Viaje extends Ticket {
    private String origen = "";
    private String destino = "";
    private String hora = "";
    protected String idViaje = "";

    public Viaje(String idViaje, String origen, String destino, String fecha, String hora, String matriculaBus, int precio, int idCliente, int idCompra, String cliente, String horaTicket) {
        super(idViaje, origen, destino, fecha, hora, matriculaBus, precio, idCliente, idCompra, cliente, horaTicket);

        this.idViaje = idViaje;
        this.origen = origen;
        this.destino = destino;
        this.hora = hora;
    }


    public String getOrigen() {
        this.origen = origen;
        return origen;}

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        this.destino=destino;
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String horaViaje) {
        this.hora = horaViaje;
    }

    public String getIdViaje() { return this.idViaje; }

    public void setIdViaje(String idViaje) { this.idViaje = idViaje; }
}
