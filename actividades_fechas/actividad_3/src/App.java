import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una fecha (dd-mm-aaaa): ");
        String fecha = scanner.next();

        LocalDate diasFecha = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        System.out.println("El mes tiene " + diasFecha.lengthOfMonth() + " días.");
        scanner.close();
    }
}
