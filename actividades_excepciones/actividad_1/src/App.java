import java.util.InputMismatchException;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 6; i++) {
            try {
                System.out.print("Introduce un número: ");
                int num = scanner.nextInt();
                if (num > max) {
                    max = num;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalido. Porfavor introduce un número entero.");
                scanner.nextLine();
                i--;
            }
        }

        System.out.println("El número mayor es: " + max);
        scanner.close();
        
    }
}
