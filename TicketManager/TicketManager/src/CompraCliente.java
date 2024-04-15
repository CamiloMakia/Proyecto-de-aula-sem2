//------------------------------------ OBJETO COMPRA DE TICKET --------------------------------------
public class CompraCliente extends Ticket {
    String cliente;
    int idCompra, idCliente;
    public CompraCliente (String cliente, int idCompra, int idCliente, String idViaje, String origen, String destino, String fecha, String hora, String matriculaBus, int precio){
        super(idViaje, origen, destino, fecha, hora, matriculaBus, precio);
        this.cliente = cliente;
        this.idCliente = idCliente;
        this.idCompra = idCompra;
    }
    public String getCliente() {
        return cliente;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}
