import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        String resultadoConcatenacion = "";

        for (int i = 0; i < 2; i++) {
            System.out.println("Introduce la palabra " + (i + 1));
            resultadoConcatenacion = resultadoConcatenacion + sc.nextLine();
        }
        
        System.out.println("La unión de ambas palabras es: " + resultadoConcatenacion);

        sc.close();

    }
}
