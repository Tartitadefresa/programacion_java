import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce 10 números enteros:");

        for (int i = 0; i < 10; i++) {
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        Collections.sort(numeros);

        System.out.println("Números ordenados:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
        
    }
}
