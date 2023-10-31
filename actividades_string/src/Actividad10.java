import java.util.Scanner;

public class Actividad10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase con almenos 5 palabras:");
       
        String frase = sc.nextLine();
        String[] palabras = frase.split(" ");

        sc.close();
        
        if(palabras.length >= 5) {
            StringBuilder subfrase1 = new StringBuilder();
            StringBuilder subfrase2 = new StringBuilder();
            
            for(int i = 0; i < 3; i++) {
                subfrase1.append(palabras[i]).append(" ");
            }
            
            for(int i = 3; i < palabras.length; i++) {
                subfrase2.append(palabras[i]).append(" ");
            }
       
            System.out.println("Las tres primeras palabras son: " + subfrase1.toString().trim());
            System.out.println("El resto de la frase es: " + subfrase2.toString().trim());
        
        } else {
            System.out.println("La frase ingresada no tiene al menos 5 palabras.");
        }

     }
}
