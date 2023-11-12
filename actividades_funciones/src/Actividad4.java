import java.util.Scanner;

public class Actividad4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce un número");
    int numero = sc.nextInt();

    sc.close();

    System.out.println("El factorial es: " + Actividad4.calculoFactorial(numero));
  }

  private static int calculoFactorial(int numero) {
    int factorial = numero;

    for(int i = (numero - 1); i >= 1; i--) {
      factorial = factorial * i;
    }

    return factorial;
  }
}
