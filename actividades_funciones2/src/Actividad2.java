import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena de texto:");
        String cadena = sc.nextLine();
        
        System.out.println("Introduce una letra:");
        String letra = sc.nextLine();  

        sc.close();
        
        System.out.println("La cadena transformada es: " + modificarCadena(cadena, letra.charAt(0)));
    }
    
    public static String modificarCadena(String cadena, char letra) {
        String nuevaCadena = cadena;
        for (int i = 0; i < nuevaCadena.length(); i++) {
            if ("aeiou".indexOf(nuevaCadena.charAt(i)) != -1) {
                nuevaCadena = nuevaCadena.replace(nuevaCadena.charAt(i), letra);
            }
        }
        

        
        return nuevaCadena;
    }
}
