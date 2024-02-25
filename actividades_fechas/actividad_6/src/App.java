import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persona[] personas = new Persona[2];

        for (int i = 0; i < personas.length; i++) {
            System.out.println("Introduce el nombre de la persona " + (i + 1) + ":");
            String nombre = scanner.nextLine();
            System.out.println("Introduce los apellidos de la persona " + (i + 1) + ":");
            String apellidos = scanner.nextLine();
            System.out.println("Introduce la fecha de nacimiento de la persona " + (i + 1) + " (formato: dd/mm/yyyy):");
            String fechaNacimiento = scanner.nextLine();
            LocalDate fecha = LocalDate.parse(fechaNacimiento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            personas[i] = new Persona(nombre, apellidos, fecha);
        }

        if (personas[0].getFechaNacimiento().isBefore(personas[1].getFechaNacimiento())) {
            System.out.println(personas[0].getNombre() + " es mayor que " + personas[1].getNombre());
        } else if (personas[0].getFechaNacimiento().isAfter(personas[1].getFechaNacimiento())) {
            System.out.println(personas[1].getNombre() + " es mayor que " + personas[0].getNombre());
        } else {
            System.out.println(personas[0].getNombre() + " y " + personas[1].getNombre() + " tienen la misma edad");
        }

        scanner.close();
    }
}
