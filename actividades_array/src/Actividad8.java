import java.util.Scanner;

public class Actividad8 {
    public static void main(String[] args) {
        
        int arrayLength = 8;
        int[] numeros = new int[arrayLength];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < arrayLength; i++) {
            System.out.println("Introduce el número " + (i +1) + " de " + arrayLength);
            numeros[i] = sc.nextInt();
            
        }

        sc.close();

        for (int i = 0; i < arrayLength; i++) {
            if (numeros[i]%2 == 0) {
                System.out.println(numeros[i] + " es par");
            } else {
                System.out.println(numeros[i] + " es impar");
            }
        }

    }
}
