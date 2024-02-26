import java.util.InputMismatchException;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Introduce un valor entero: ");
            int valor = scanner.nextInt();
            System.out.println("Valor introducido: " + valor);
        } catch (InputMismatchException e) {
            System.out.println("Valor introducido incorrecto");
        }
        scanner.close();
    }
}
