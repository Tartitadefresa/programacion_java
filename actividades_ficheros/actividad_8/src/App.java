import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> personas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú Principal");
            System.out.println("1. Registrar Persona");
            System.out.println("2. Guardar registros de personas en fichero");
            System.out.println("3. Recuperar registros de personas desde el fichero");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    registrarPersona(personas, scanner);
                    break;
                case 2:
                    guardarRegistros(personas);
                    break;
                case 3:
                    recuperarRegistros();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }

    public static void registrarPersona(ArrayList<String> personas, Scanner scanner) {
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.next();
        personas.add(nombre);
        System.out.println("Persona registrada exitosamente.");
    }

    public static void guardarRegistros(ArrayList<String> personas) {
        try {
            File file = new File("personas.txt");
            FileWriter writer = new FileWriter(file);

            for (String persona : personas) {
                writer.write(persona + "\n");
            }

            writer.close();
            System.out.println("Registros guardados en el fichero personas.txt.");
        } catch (IOException e) {
            System.out.println("Error al guardar los registros en el fichero.");
        }
    }

    public static void recuperarRegistros() {
        try {
            File file = new File("personas.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String persona = scanner.nextLine();
                System.out.println(persona);
            }

            scanner.close();
        } catch (IOException e) {
            System.out.println("Error al recuperar los registros desde el fichero.");
        }
    }
}
