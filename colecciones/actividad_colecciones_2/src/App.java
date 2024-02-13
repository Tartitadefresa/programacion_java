import java.util.ArrayList;
import java.util.Random;
public class App {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        int tamaño = random.nextInt(11) + 10;
        int suma = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < tamaño; i++) {
            int randomNumber = random.nextInt(101);
            numeros.add(randomNumber);
            suma += randomNumber;
            max = Math.max(max, randomNumber);
            min = Math.min(min, randomNumber);
        }

        double media = (double) suma / tamaño;

        System.out.println("Numeros: " + numeros);
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        
    }
}
