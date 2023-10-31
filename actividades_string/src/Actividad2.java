import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();
    
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
        
        sc.close();
    }
}
