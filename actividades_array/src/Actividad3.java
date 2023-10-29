import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        int arrayLength = 10;
        int[] numbers = new int[arrayLength];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < arrayLength; i++) {
            System.out.println("Introduce el número " + ( i + 1) + " de " + arrayLength);
            numbers[i] = sc.nextInt();
        }
        
        for(int i = (arrayLength - 1); i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        sc.close();
    }
    
}
