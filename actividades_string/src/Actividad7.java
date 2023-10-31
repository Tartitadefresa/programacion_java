import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();
        
        sc.close();

        System.out.println("La frase sin espacios es: " + frase.replaceAll("\\s", ""));

    }
}
