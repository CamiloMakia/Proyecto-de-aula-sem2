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
        System.out.println("2) EDITAR VIAJE "); // Falta
        System.out.println("3) ELIMINAR VIAJE ");
        System.out.println("4) VER VIAJES DISPONIBLES");
        System.out.println("5) SALIR");

    }

    static void menuApartadoVentas() {

        System.out.println("MENU DE VENTAS");
        System.out.println("1) VENDER TICKETS\n2) CONSULTAR VIAJES DISPONIBLES ");
        System.out.println("3) REGISTRO DE VENTAS DE TICKETS"); //Falta
        System.out.println("4) ELIMINAR UN REGISTRO");//Falta
        System.out.println("5) ELIMINAR TODOS LOS REGISTROS");//Falta
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

    public static void guardarRegistroTickets(CompraCliente compraTicket) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO2, true))) {
            oos.writeObject(compraTicket);
            System.out.println("\nRegistro de venta guardado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar el registro de venta: " + e.getMessage());
        }
    }

    public static List<Ticket> cargarListaRegistros() {
        List<Ticket> registros = new ArrayList<>();
        // Nombre del archivo donde se guardan los registros
        String nombreArchivo = "registros.txt";

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            registros = (List<Ticket>) ois.readObject();
            System.out.println("Registros cargados correctamente desde el archivo.");
        } catch (FileNotFoundException e) {
            // Si el archivo no existe, se crea uno nuevo
            System.out.println("No se encontró el archivo de registros. Se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) {
            // Manejo de excepciones de entrada/salida y de clase no encontrada
            e.printStackTrace();
        }
        return registros;}
}