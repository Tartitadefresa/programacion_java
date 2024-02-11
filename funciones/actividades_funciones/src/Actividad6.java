import java.util.Scanner;

public class Actividad6 {
  private static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    int selection = Actividad6.imprimeMenu();;
  }

  public static int imprimeMenu() {
    int selection = 0;

    do {
      System.out.println("Selecciona una opción:");
      System.out.println("1. Opción 1");
      System.out.println("2. Opción 2");
      System.out.println("3. Opción 3");
      System.out.println("4. Salir");

      selection = sc.nextInt();

      if (selection < 0 || selection > 4) {
        System.out.println("Opción no válida.");
      }
    } while (selection != 4);

    return selection;
  }
}
