import java.util.Scanner;

public class Actividad2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce un número");
    float numero1 = sc.nextFloat();
    
    System.out.println("Introduce otro número");
    float numero2 = sc.nextFloat();
    
    System.out.println("Elige una operación a realizar: suma, resta o producto");
    String operacion = sc.next();

    sc.close();

    System.out.println("El resultado es: " + Actividad2.calculoOperacion(numero1, numero2, operacion));
  }

  private static float calculoOperacion(float numero1, float numero2, String operacion){
    float resultado = 0;


    switch (operacion) {
      case "suma":
        resultado = numero1 + numero2;
        break;
    
      case "resta":
        resultado =  numero1 - numero2;
        break;
      
      case "producto":
        resultado = numero1 * numero2;
        break;
    }

    return resultado;
  }  
}
