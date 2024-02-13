import java.util.HashMap;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("hola", "hello");
        diccionario.put("adiós", "goodbye");
        diccionario.put("casa", "house");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("manzana", "apple");
        diccionario.put("naranja", "orange");
        diccionario.put("libro", "book");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("coche", "car");
        diccionario.put("avión", "airplane");
        diccionario.put("tren", "train");
        diccionario.put("barco", "boat");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("estrella", "star");
        diccionario.put("agua", "water");
        diccionario.put("fuego", "fire");
        diccionario.put("tierra", "earth");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una palabra en español: ");
        String palabra = scanner.nextLine();

        String traduccion = diccionario.get(palabra);

        if (traduccion != null) {
            System.out.println("La traducción de \"" + palabra + "\" es \"" + traduccion + "\".");
        } else {
            System.out.println("No se encontró la traducción de \"" + palabra + "\".");
        }
        
    }
}
