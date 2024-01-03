import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(System.in);
      int opciones = 0;
      boolean salir = false;
      Fecha fecha = new Fecha();
      
      do {
        System.out.println("1. Ingresar fecha");
        System.out.println("2. Mostrar fecha corta");
        System.out.println("3. Mostrar fecha larga");
        System.out.println("4. Mostrar dias transcurridos");
        System.out.println("5. Salir");
        
        opciones = scanner.nextInt();
        
        switch (opciones) {
            case 1:
                System.out.println("Ingrese el dia");
                int dia = scanner.nextInt();
                System.out.println("Ingrese el mes");
                int mes = scanner.nextInt();
                System.out.println("Ingrese el año");
                int año = scanner.nextInt();
                fecha.leer(dia, mes, año);
                break;

            case 2:
                fecha.corta();
                break;

            case 3:
                String fechaLarga = fecha.larga();
                System.out.println("La fecha larga es: " + fechaLarga);
                break;

            case 4:
                long diasTranscurridos = fecha.diasTranscurridos();
                System.out.println("Han transcurrido " + diasTranscurridos + " dias");
                break;

            case 5:
                salir = true;
                break;
        }

      } while (!salir);
    
    scanner.close();
    }

}
