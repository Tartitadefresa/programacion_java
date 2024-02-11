import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         
        while (true) {
            System.out.println("Introduzca un número: ");
            int numero = sc.nextInt();
            if (numero == -1) {
                break;
            }
            int producto = productoDivisores(numero);
            System.out.println("El producto de los divisores de " + numero + " es: " + producto);
        }
        sc.close();
    
    }

    public static int productoDivisores(int numero) {
        int producto = 1;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                producto = producto * i;
            }
        }
        
        return producto; 
    }
}




    
        
       
    

