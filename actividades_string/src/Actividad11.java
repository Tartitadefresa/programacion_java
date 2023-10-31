import java.util.Scanner;

public class Actividad11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa la primera palabra:");
        StringBuilder palabra1 = new StringBuilder(sc.nextLine());

        System.out.println("Ingresa la segunda palabra:");
        StringBuilder palabra2 = new StringBuilder(sc.nextLine());

        sc.close();

        if (palabra1.toString().equals(palabra2.toString())) {
            System.out.println("La palabra " + palabra1 + " es igual a la palabra " + palabra2);
        } else {
            System.out.println("La palabra " + palabra1 + " no es igual a la palabra " + palabra2);
        }

    }
}
