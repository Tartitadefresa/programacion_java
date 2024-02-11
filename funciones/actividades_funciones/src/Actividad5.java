import java.util.Scanner;

public class Actividad5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce un número");
    int num = sc.nextInt();

    sc.close();

    Actividad5.numeroInvertido(num);
    System.out.println("El número invetido es " + Actividad5.numeroInvertido(num));
  }

    private static int numeroInvertido(int num) {
      String strNumber = Integer.toString(num);
      String numeroInverso = "";

      for (int i = (strNumber.length() - 1); i >= 0; i--) {
        numeroInverso += strNumber.charAt(i);
      }

      return Integer.parseInt(numeroInverso);
    }
}
