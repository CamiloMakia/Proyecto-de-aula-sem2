//----------------------------- FUNCIONES DEL PROGRAMA ------------------------------------
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funciones {
    private static final String ARCHIVO = "DATA.txt"; // Archivo para guardar los objetos
    private static final String ARCHIVO2= "REGISTRO.txt"; // Archivo para guardar los registros de ventas de tickets
    static Scanner scanner = new Scanner(System.in);


    static void menuApartadoViajes() {

        System.out.println("CONFIGURACION DE VIAJES");
        System.out.println("1) AGREGAR NUEVO VIAJE");
        System.out.println("2) ELIMINAR VIAJES ");
        System.out.println("3) VER VIAJES DISPONIBLES");
        System.out.println("4) SALIR");

    }

    static void menuApartadoVentasAdmin() {

        System.out.println("MENU DE VENTAS");
        System.out.println("1) CONSULTAR VIAJES DISPONIBLES ");
        System.out.println("2) REGISTRO DE VENTAS DE TICKETS");
        System.out.println("3) ELIMINAR UN REGISTRO");
        System.out.println("4) ELIMINAR TODOS LOS REGISTROS");
        System.out.println("5) CONSULTAR UTILIDADES");
        System.out.println("6) SALIR");

    }

    static void menuApartadoVentas() {

        System.out.println("MENU DE VENTAS");
        System.out.println("1) VENDER TICKETS\n2) CONSULTAR VIAJES DISPONIBLES ");
        System.out.println("3) REGISTRO DE VENTAS DE TICKETS");
        System.out.println("4) ELIMINAR UN REGISTRO");
        System.out.println("5) ELIMINAR TODOS LOS REGISTROS");
        System.out.println("6) CONSULTAR UTILIDADES");//Falta
        System.out.println("7) SALIR");

    }

    public static void guardarListaTickets(List<Ticket> listaTickets) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO))) {
            oos.writeObject(listaTickets);
            System.out.println("\nOperacion realizada correctamente. ");
        } catch (IOException e) {
            System.out.println("Error al guardar la lista de tickets: " + e.getMessage());
        }
    }

    public static List<Ticket> cargarListaTickets() {
        List<Ticket> listaTickets = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO))) {
            listaTickets = (List<Ticket>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar la lista de tickets: " + e.getMessage());
        }
        return listaTickets;
    }

    public static void cargarRegistroVentas(List<Ticket> listaRegistrosVentas) {
        try (BufferedReader br = new BufferedReader(new FileReader("REGISTRO.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Parsear la línea y agregar el ticket a la lista
                // Supongamos que cada línea del archivo representa un ticket en formato CSV
                String[] parts = line.split(",");
                // Suponiendo que el formato del archivo es: idViaje,origen,destino,fecha,hora,matriculaBus,precio,idCliente,idCompra,cliente
                Ticket ticket = new Ticket(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], Integer.parseInt(parts[6]), Integer.parseInt(parts[7]), Integer.parseInt(parts[8]), parts[9]);
                listaRegistrosVentas.add(ticket);
            }
        } catch (IOException e) {
            System.out.println("Error al cargar el registro de ventas: " + e.getMessage());
        }
    }

    public static void guardarRegistroVentas(List<Ticket> listaRegistrosVentas) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("REGISTRO.txt"))) {
            for (Ticket ticket : listaRegistrosVentas) {
                // Escribir cada ticket en una línea del archivo
                // Suponemos que cada línea del archivo representa un ticket en formato CSV
                bw.write(ticket.getIdViaje() + "," + ticket.getOrigen() + "," + ticket.getDestino() + "," + ticket.getFecha() + "," + ticket.getHora() + "," + ticket.getMatriculaBus() + "," + ticket.getPrecio() + "," + ticket.getIdCliente() + "," + ticket.getIdCompra() + "," + ticket.getCliente());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar el registro de ventas: " + e.getMessage());
        }
    }
}