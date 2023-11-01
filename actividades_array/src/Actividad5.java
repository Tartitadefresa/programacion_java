import java.util.Scanner;

public class Actividad5 {
    public static void main(String[] args) {
        int arrayLength = 10;
        int max = 0;
        int min = 0;
        int[] numbers = new int[arrayLength];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < arrayLength; i++){
            System.out.println("Introduce el número " + (i + 1) + " de " + arrayLength);
            numbers[i] = sc.nextInt();

            if (i == 0) {
                max = numbers[i];
                min = numbers[i];
            }

            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        for(int i = 0; i < arrayLength; i++) {
            String result = Integer.toString(numbers[i]);

            if (numbers[i] == max) {
                result = result + " máximo";
            } else if (numbers[i] == min) {
                result = result + " mínimo";
            }
            
            System.out.println(result);
        }

        sc.close();
    }
}
