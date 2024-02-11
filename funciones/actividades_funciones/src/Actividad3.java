import java.util.Scanner;

public class Actividad3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce una cadena de texto");
    String cadena = sc.nextLine();

    System.out.println("Introduce un número");
    int veces = sc.nextInt();

    sc.close();

    Actividad3.imprimeCadena(cadena, veces);
  }

  public static void imprimeCadena (String cadena, int veces) {
    String resultado = "";
    
    for (int i = 0; i < veces; i++) {
      resultado = resultado + cadena + " ";
    }

    System.out.println(resultado);
  }
}
