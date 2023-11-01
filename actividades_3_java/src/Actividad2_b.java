import java.util.Scanner;

public class Actividad2_b {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre ");
        String nombreUsuario = sc.nextLine();

        System.out.println("Introduce la edad ");
        int edadUsuario = sc.nextInt();
   
        System.out.println(nombreUsuario + " tiene " + edadUsuario + " años");
        sc.close();
    }
}
