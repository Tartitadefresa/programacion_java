import java.util.Arrays;
import java.util.Scanner;

public class Actividad6 {
    public static void main(String[] args) {
        int arrayLength = 15;
        int[] numbers = new int[arrayLength];
        int[] numbersRotated = new int[arrayLength];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < arrayLength; i++) {
            System.out.println("Introduce el número " + (i +1) + " de " + arrayLength);
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < arrayLength; i++) {
            if (i == (arrayLength - 1)) {
                numbersRotated[0] = numbers[i];
            } else {
                numbersRotated[i + 1] = numbers[i];
            }
        }

        System.out.println(Arrays.toString(numbersRotated));



        sc.close();
    }
}
