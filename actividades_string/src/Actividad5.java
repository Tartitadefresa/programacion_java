import java.util.Scanner;

public class Actividad5 {
    public static void main(String[] args) {
        String resultado = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();
        
        sc.close();

        for(int i = 0; i < frase.length(); i++){
            if ("aeiou".indexOf(frase.charAt(i)) != -1) {    
                resultado += "a";
            } else {
                resultado += Character.toString(frase.charAt(i));
            }
        }

        System.out.println(resultado);

    }
}
