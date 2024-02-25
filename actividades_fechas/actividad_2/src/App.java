import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la fecha de nacimiento (dd/MM/YYYY): ");
        String fechaNacimiento = scanner.next();

        LocalDate nacimiento = LocalDate.parse(fechaNacimiento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println("El dia de la semana es: " + nacimiento.getDayOfWeek());

        scanner.close();
    }
}
