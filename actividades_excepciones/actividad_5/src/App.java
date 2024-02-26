import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public static void main(String[] args) {
        int opcion = 0;
        Scanner entrada = new Scanner(System.in);
        try {
            do {
                System.out.println("Seleccione una opción: ");
                System.out.println("1 - Insertar un cliente nuevo.");
                System.out.println("2 - Salir. ");
                opcion = Integer.parseInt(entrada.nextLine());
                switch (opcion) {
                    case 1:
                        System.out.println("Dime el nombre: ");
                        String nombre = entrada.nextLine();
                        System.out.println("Dime la dirección: ");
                        String direccion = entrada.nextLine();
                        System.out.println("Dime la edad: ");
                        int edad = entrada.nextInt();
                        nuevoCliente(nombre, direccion, edad);
                        break;
                }
            } while (opcion != 2);
        } catch (ClienteExisteException e) {
            System.out.println("Error " + e);
        } catch (EdadNoPermitidaException e) {
            System.out.println("Error " + e);
        }
    }

    public static Cliente buscarCliente(String nombre) {
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equals(nombre)) {
                return cliente;
            }
        }
        return null;
    }

    public static void nuevoCliente(String nombre, String direccion, int edad) throws ClienteExisteException, EdadNoPermitidaException {

        if (edad < 18) {
            throw new EdadNoPermitidaException(edad);
        }
        Cliente nuevoCliente = buscarCliente(nombre);
        if (nuevoCliente != null) {
            throw new ClienteExisteException(nuevoCliente);
        } else {
            nuevoCliente = new Cliente(nombre, direccion, edad);
            clientes.add(nuevoCliente);
            System.out.println("Cliente dado de alta correctamente!");
        }
    }

}
