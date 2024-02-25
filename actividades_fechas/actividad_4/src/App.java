import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la fecha de compra de su coche (dd/mm/aaaa): ");
        String fechaCompra = scanner.next();

        LocalDate fechaItv = LocalDate.parse(fechaCompra, DateTimeFormatter.ofPattern("dd/MM/yyyy")).plusYears(4);

        System.out.println("La fecha de la próxima ITV es: " + fechaItv);

        scanner.close();
    }
}
