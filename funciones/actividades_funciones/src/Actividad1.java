import java.util.Scanner;

public class Actividad1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = 0;
    System.out.println("Introduce un número mayor que 0");

    while(true) {
      num = sc.nextInt();
      
      if(num <= 0) {
          System.out.println("El número introducido no es válido, introduce otro número mayor que 0");
      } else {
          break;
      }
    }

    sc.close();

    if (Actividad1.esPrimo(num)) {
        System.out.println("El número introducido es primo");
    } else {
        System.out.println("El número introducido no es primo");
    }

    if (Actividad1.esMayorDe10(num)) {
        System.out.println("El número introducido es mayor que 10");
    } else {
        System.out.println("El número introducido no es mayor que 10");
    }
  }

  private static boolean esPrimo(int num) {
    if (num <= 1) {
      return false;
    }

    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        return false;
      }
    }

    return true;
  }


  private static boolean esMayorDe10 (int num) {
    if (num > 10) {
      return true;
    } else {
      return false;
    }
  }
}
