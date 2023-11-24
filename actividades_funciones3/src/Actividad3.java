import java.util.Scanner;
public class Actividad3 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String input = sc.nextLine();

        int cambios = transformarCadena(input);

        System.out.println("Número de cambios realizados: " + cambios);

        sc.close();
    }

    public static int transformarCadena(String cadena) {
        int cambios = 0;
        char[] caracteres = cadena.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < caracteres.length; i++) {
            char caracterActual = caracteres[i];

            System.out.println(Character.isLowerCase(caracterActual));

            if (Character.isLowerCase(caracterActual)) {
                caracteres[i] = Character.toUpperCase(caracterActual);
                cambios++;
            } else if (Character.isUpperCase(caracterActual)) {
                caracteres[i] = Character.toLowerCase(caracterActual);
                cambios++;
            }

            sb.append(caracteres[i]);
        }

        System.out.println("Cadena transformada: " + sb.toString());

        return cambios;
    }

}
