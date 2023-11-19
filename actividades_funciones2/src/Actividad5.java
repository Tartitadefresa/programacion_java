import java.util.Scanner;

public class Actividad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        
        int opcionSeleccionada = 0;
        do {
            System.out.println("----SALUDA APP----");
            System.out.println("1. Realizar un saludo básico");
            System.out.println("2. Realizar un saludo personalizado");
            System.out.println("3. Salir");
            opcionSeleccionada = sc.nextInt();
            sc.nextLine();
            

           switch (opcionSeleccionada) {
            case 1:
                Actividad5.realizarSaludo();
                break;
           
            case 2:
                System.out.println("Introduce un nombre");
                String nombre= sc.nextLine();
                Actividad5.realizarSaludo(nombre);
                break;
            
            case 3:
                salir = true;

           }
        
        } while (!salir); 

        sc.close();
    }

    public static void realizarSaludo() {
        System.out.println("Hola a tod@s!");

    }

    public static void realizarSaludo(String nombre) {
        System.out.println("Hola " + nombre + "!");
    }
}
