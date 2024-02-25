import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate fecha = LocalDate.now();
        System.out.println("¿En cuantos días quieres que te recuerde?");
        int dias = sc.nextInt();

        System.out.println("¿Qué quieres que te recuerde?");
        String recordatorio = sc.next();
        sc.close();

        fecha.plusDays(dias);

        System.out.println("Te recordaré que " + recordatorio + " el día " + fecha.plusDays(dias));
    }
}
