import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu nombre:");
        String name = sc.nextLine();

        sc.close();
        System.out.println("Hola, ".concat(name));
    }
}
