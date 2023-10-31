import java.util.Scanner;

public class Actividad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();

        sc.close();

        stringBuilder.append(frase);

        System.out.println("La frase volteada es: " + stringBuilder.reverse());
    }
}
