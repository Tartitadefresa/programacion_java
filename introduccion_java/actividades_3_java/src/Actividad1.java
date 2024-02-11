import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        
    int resultado = 0;
    Scanner sc = new Scanner(System.in);
    
    for (int i = 0; i < 2; i++) {
        System.out.println("Introduce el número " + (i + 1));
        int numero = sc.nextInt();
        resultado = resultado + numero;
    }

    System.out.println("El resultado de la suma es: " + resultado);

    sc.close();
    }
}