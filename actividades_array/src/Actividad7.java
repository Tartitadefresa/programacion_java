import java.util.Arrays;
import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) {
        int arrayLength = 100;
        Object[] array = new Object[arrayLength];
        String showArray = "";
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < arrayLength; i++) {
            array[i] = (int)(Math.random() * 21);
            showArray += array[i] + " ";
        }

        System.out.println(showArray);

        System.out.println("Introduce el primer número:");
        int number1 = sc.nextInt();

        System.out.println("Introduce el segundo número:");
        int number2 = sc.nextInt();

        sc.close();

        for (int i = 0; i < arrayLength; i++) {
            if ((int)array[i] == number1) {                
                array[i] = "'" + number2 + "'";
            }
        }

        System.out.println(Arrays.toString(array));
    }
}