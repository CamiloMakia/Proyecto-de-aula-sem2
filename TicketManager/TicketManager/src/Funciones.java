//----------------------------- FUNCIONES DEL PROGRAMA ------------------------------------
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Funciones {
    private static final String ARCHIVO = "DATA.txt"; // Archivo para guardar los objetos
    static Scanner scanner = new Scanner(System.in);


    static void menuApartadoViajes() {

        System.out.println("╔=======CONFIGURACION DE VIAJES========╗");
        System.out.println("║1) AGREGAR NUEVO VIAJE                ║");
        System.out.println("║2) ELIMINAR VIAJES                    ║");
        System.out.println("║3) VER VIAJES DISPONIBLES             ║");
        System.out.println("║4) SALIR                              ║");
        System.out.println("╚======================================╝");
    }

    static void menuApartadoVentasAdmin() {

        System.out.println("╔============MENU DE VENTAS============╗");
        System.out.println("║1) CONSULTAR VIAJES DISPONIBLES       ║");
        System.out.println("║2) REGISTRO DE VENTAS DE TICKETS      ║");
        System.out.println("║3) ELIMINAR UN REGISTRO               ║");
        System.out.println("║4) ELIMINAR TODOS LOS REGISTROS       ║");
        System.out.println("║5) CONSULTAR UTILIDADES               ║");
        System.out.println("║6) SALIR                              ║");
        System.out.println("╚======================================╝");
    }

    static void menuApartadoVentas() {

        System.out.println("╔============MENU DE VENTAS============╗");
        System.out.println("║1) VENDER TICKETS                     ║");
        System.out.println("║2) CONSULTAR VIAJES DISPONIBLES       ║");
        System.out.println("║3) REGISTRO DE VENTAS DE TICKETS      ║");
        System.out.println("║4) ELIMINAR UN REGISTRO               ║");
        System.out.println("║5) ELIMINAR TODOS LOS REGISTROS       ║");
        System.out.println("║6) CONSULTAR UTILIDADES               ║");
        System.out.println("║7) SALIR                              ║");
        System.out.println("╚======================================╝");
    }

    public static void guardarListaViajes(List<Ticket> listaViajes) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO))) {
            oos.writeObject(listaViajes);
            System.out.println("\nOperacion realizada correctamente. ");
        } catch (IOException e) {
            System.out.println("Error al guardar la lista de tickets: " + e.getMessage());
        }
    }

    public static List<Ticket> cargarListaViajes() {
        List<Ticket> listaViajes = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO))) {
            listaViajes = (List<Ticket>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar la lista de tickets: " + e.getMessage());
        }
        return listaViajes;
    }

}