import java.time.LocalTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la hora de apertura del establecimiento: ");
        int horaApertura = scanner.nextInt();
        LocalTime hora = LocalTime.of(horaApertura, 0);

        System.out.println("Introduce las horas que permanecerá abierto el establecimiento: ");
        int horasAbierto = scanner.nextInt();

        LocalTime horaCierre = hora.plusHours(horasAbierto);
        System.out.println("La hora de cierre del establecimiento que abre a las " + horaApertura + " y permanece abierto " + horasAbierto + " horas es: " + horaCierre.getHour() + ":" + horaCierre.getMinute() + " horas.");

        scanner.close();
        
    }
}
