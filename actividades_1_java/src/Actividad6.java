import java.util.Scanner;

public class Actividad6 {
    public static void main(String[] args) {
        int suma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int number = sc.nextInt();
        
        String strNumber = Integer.toString(number);
        
        for (int i = 0; i < strNumber.length(); i++) {
            int digit = Character.getNumericValue(strNumber.charAt(i));
            

            suma = suma + digit;
        }

        System.out.println("El número " + strNumber + " tiene " + strNumber.length() + " dígitos.");
        System.out.println("Y la suma es " + suma);

        sc.close();
    }
}
