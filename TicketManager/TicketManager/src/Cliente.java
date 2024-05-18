import java.lang.reflect.Array;
import java.util.ArrayList;

public class Cliente extends Ticket{
    private int idCliente;
    private String cliente;
   // ArrayList<Ticket> listaTiquetes = new ArrayList<>();

    public Cliente(String idViaje, String origen, String destino, String fecha, String hora, String matriculaBus, int precio, int idCliente, int idCompra, String cliente, String horaTicket) {
        super(idViaje, origen, destino, fecha, hora, matriculaBus, precio, idCliente, idCompra, cliente, horaTicket);
    }


    public String getCliente() {
        this.cliente=cliente;
        return cliente;
    }


    public int getIdCliente() {
        this.idCliente=idCliente;
        return idCliente;
    }


}
