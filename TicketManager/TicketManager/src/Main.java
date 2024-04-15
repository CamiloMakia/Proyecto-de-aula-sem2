//---------------------------------------- METODO MAIN --------------------------------------
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        // Usuarios
        String usuario1 = "Administrador", usuario2 = "Operador", password1 = "admin123", password2 = "operador123", validUsuario = "", validPassword = "";
        // Variables
        int valid1 = 0, valid2 = 0, valid3 = 0, valid4 = 0, valid5 = 0, valid6 = 0, valid7 = 0, valid8 = 0, valid9 = 0, valid10=0;
        boolean valid0 = true;
        // LLamado a la clase de funciones
        Funciones object = new Funciones();
        // Lista de tickets
        List<Ticket> listaTickets = Funciones.cargarListaTickets();// Cargar la lista de tickets al iniciar el programa
        // Lista de compras
        List<Ticket> listaRegistros = Funciones.cargarListaRegistros();
        // ---------------------------------------------
        String clear = "\u001b[2J"; // clear
        // --------------------------- INICIO ----------------------------------------------------
        do {
            // LOGIN
            System.out.println(clear);
            System.out.println("TICKET MANAGER");
            System.out.println("Usuario: ");
            validUsuario = scanner.nextLine();
            System.out.println("Contraseña: ");
            validPassword = scanner.nextLine();

            if (validUsuario.equals(usuario1) && validPassword.equals(password1)) {

                do {

                    // Perfil usuario administrador
                    System.out.println(clear);
                    System.out.println("MENÚ ADMINISTRADOR");
                    System.out.println("1) APARTADO DE VIAJES");
                    System.out.println("2) APARTADO DE VENTAS");
                    System.out.println("3) SALIR");
                    valid1 = scanner.nextInt();

                    switch (valid1) {

                        case 1: //APARTADO DE VIAJES
                            do {
                                System.out.println(clear);
                                Funciones objeto = new Funciones();
                                Funciones.menuApartadoViajes();
                                valid3 = scanner.nextInt();
                                scanner.nextLine();
                                switch (valid3) {

                                    case 1:
                                        do {
                                            System.out.println(clear);
                                            System.out.println("------- AGREGAR VIAJE -------");
                                            System.out.println("Introduce el ID asignado para el viaje: ");
                                            String idViaje = scanner.nextLine();
                                            System.out.println("Introduce el origen: ");
                                            String origen = scanner.nextLine();
                                            System.out.println("Introduce el destino: ");
                                            String destino = scanner.nextLine();
                                            System.out.println("Introduce la fecha: ");
                                            String fecha = scanner.nextLine();
                                            System.out.println("Introduce la hora: ");
                                            String hora = scanner.nextLine();
                                            System.out.println("Introduce el precio del ticket: ");
                                            int precio = scanner.nextInt();
                                            scanner.nextLine();
                                            System.out.println("Introduce la matricula del bus: ");
                                            String matriculaBus = scanner.nextLine();
                                            Ticket tickets = new Ticket(idViaje, origen, destino, fecha, hora, matriculaBus, precio);
                                            listaTickets.add(tickets);
                                            System.out.println("Viaje añadido correctamente");
                                            System.out.println("1) Añadir otro viaje");
                                            System.out.println("2) salir");
                                            valid5 = scanner.nextInt();
                                            switch (valid5) {
                                                case 1:
                                                    continue;
                                            }
                                        } while (valid5 != 2);
                                        Funciones.guardarListaTickets(listaTickets);
                                        break;

                                    case 3:
                                        do {
                                            System.out.println(clear);
                                            System.out.println("ELIMINAR");
                                            System.out.println("1) Eliminar todo\n2) Eliminar uno\n3) Salir ");
                                            valid6 = scanner.nextInt();
                                            switch (valid6) {
                                                case 1:
                                                    System.out.println("Seguro que desea eliminar todos los viajes?\n1) SI\n2) NO");
                                                    valid7 = scanner.nextInt();
                                                    switch (valid7) {
                                                        case 1:
                                                            listaTickets.clear();
                                                            System.out.println("Todos los viajes han sido eliminados correctamente.");
                                                            Funciones.guardarListaTickets(listaTickets);
                                                            break;
                                                        case 2:
                                                            break;
                                                    }
                                                case 2:
                                                    scanner.nextLine();
                                                    System.out.println("Ingrese el ID del viaje que desea eliminar: ");
                                                    String idViajeEliminar = scanner.nextLine();
                                                    Iterator<Ticket> iterator = listaTickets.iterator();
                                                    while (iterator.hasNext()) {
                                                        Ticket ticket = iterator.next();
                                                        if (ticket.getIdViaje().equals(idViajeEliminar)) {
                                                            iterator.remove();
                                                            System.out.println("Eliminado correctamente");
                                                            scanner.nextLine();
                                                            break;
                                                        } else {
                                                            System.out.println("El viaje indicado no se ha encontrado");
                                                            continue;
                                                        }
                                                    }
                                            }
                                        } while (valid6 != 3);
                                        break;

                                    case 4:
                                        System.out.println("           VIAJES DISPONIBLES");
                                        System.out.println(clear);
                                        for (Ticket tickets : listaTickets) {
                                            System.out.println("------------------------------------------");
                                            System.out.println("ID: #" + tickets.getIdViaje());
                                            System.out.println("Origen: " + tickets.getOrigen());
                                            System.out.println("Destino: " + tickets.getDestino());
                                            System.out.println("Fecha: " + tickets.getFecha());
                                            System.out.println("Hora: " + tickets.getHora());
                                            System.out.println("Bus: " + tickets.getMatriculaBus());
                                            System.out.println("Precio de viaje: " + tickets.getPrecio() + "$");
                                            System.out.println("------------------------------------------");
                                            System.out.println(clear);
                                        }
                                }

                            } while (valid3 != 5);
                            break;

                        case 2:
                            do {
                                System.out.println(clear);
                                Funciones.menuApartadoVentas();
                                valid4 = scanner.nextInt();
                            } while (valid4 != 6);
                            break;

                    }

                } while (valid1 != 3);

            } else if (validUsuario.equals(usuario2) && validPassword.equals(password2)) {

                do {
                    // Perfil usuario operador
                    System.out.println(clear);
                    Funciones.menuApartadoVentas();
                    valid2 = scanner.nextInt();
                    switch (valid2) {
                        case 1: // Vender ticket
                            do {
                                System.out.println(clear);
                                System.out.println("VENTA DE TICKETS");
                                System.out.println("Ingrese el ID del ticket que desea comprar:");
                                String idTicketCompra = scanner.next();
                                for (Ticket ticket : listaTickets) {
                                    if (ticket.getIdViaje().equals(idTicketCompra)) {
                                        System.out.println("El ticket que desea comprar tiene un valor de: " + ticket.getPrecio() + "$\nSi desea confirmar la compra introduzca su contraseña operador");
                                        String validPwd = scanner.next();
                                        scanner.nextLine();
                                        if (validPwd.equals(password2)) {
                                            System.out.println("Introduzca el nombre del cliente:");
                                            String cliente = scanner.nextLine();
                                            System.out.println("Introduzca el ID del cliente");
                                            int idCliente = scanner.nextInt();
                                            scanner.nextLine();
                                            int idCompra = random.nextInt(999999);
                                            CompraCliente compraTicket = new CompraCliente(cliente, idCompra, idCliente, idTicketCompra, ticket.getOrigen(), ticket.getDestino(), ticket.getFecha(), ticket.getHora(), ticket.getMatriculaBus(), ticket.getPrecio());
                                            System.out.println("Compra exitosa!");
                                            System.out.println(clear);
                                            System.out.println("--------------- TICKET ----------------");
                                            System.out.println("Origen: " + ticket.getOrigen());
                                            System.out.println("Destino: " + ticket.getDestino());
                                            System.out.println("Fecha: " + ticket.getFecha());
                                            System.out.println("Hora: " + ticket.getHora());
                                            System.out.println("Bus: " + ticket.getMatriculaBus());
                                            System.out.println("Valor ticket: " + ticket.getPrecio() + "$");
                                            System.out.println("Cliente: " + compraTicket.getCliente());
                                            System.out.println("ID Cliente: " + compraTicket.getIdCliente());
                                            System.out.println("ID Compra: " + compraTicket.getIdCompra());
                                            System.out.println("-----------------------------------------");
                                            Funciones.guardarRegistroTickets(compraTicket);
                                            valid2=1;

                                        } else {
                                            System.out.println("Contraseña incorrecta");
                                            continue;
                                        }
                                    } else {
                                        System.out.println("No se encontró ningún ticket con el ID proporcionado.\nIntente nuevamente");
                                        continue;
                                    }
                                }

                            } while (valid2 != 1);
                            break;

                        case 2:
                            do {
                                System.out.println(clear);
                                System.out.println("           VIAJES DISPONIBLES");
                                System.out.println(clear);
                                for (Ticket tickets : listaTickets) {
                                    System.out.println("------------------------------------------");
                                    System.out.println("ID: " + tickets.getIdViaje());
                                    System.out.println("Origen: " + tickets.getOrigen());
                                    System.out.println("Destino: " + tickets.getDestino());
                                    System.out.println("Fecha: " + tickets.getFecha());
                                    System.out.println("Hora: " + tickets.getHora());
                                    System.out.println("Bus: " + tickets.getMatriculaBus());
                                    System.out.println("Precio de viaje: " + tickets.getPrecio() + "$");
                                    System.out.println("------------------------------------------");
                                    System.out.println(clear);
                                }
                                System.out.println("1) SALIR");
                                valid9 = scanner.nextInt();
                            } while (valid9 != 1);
                            break;

                        case 3:
                            do {
                                // COdigo para mostrar el registro de ventas
                                System.out.println("1) Salir");
                                valid10 = scanner.nextInt();
                            } while (valid10 != 1);
                            break;
                    }
                } while (valid2 != 7);
                break;
            }
            if (validUsuario.equals("salir")) {
                break;
            } else {
                System.out.println(clear);
                System.out.println("          ATENCION");
                System.out.println("Usuario o contraseña incorrectos");
                System.out.println("Por favor intente nuevamente");
            }

        } while (valid0);
    }
}