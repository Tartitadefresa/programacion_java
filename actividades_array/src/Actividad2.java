import java.util.Arrays;

public class Actividad2 {
    
    public static void main(String[] args) {
        char[] simbolo = new char[10];

        simbolo[0] = 'a';
        simbolo[1] = 'x';
        simbolo[4] = '@';
        simbolo[6]= ' ';
        simbolo[7] = '+';
        simbolo[8] = 'Q';

        System.out.println(Arrays.toString(simbolo));

        //Los valores de los elementos que no hemos inicializado se convierten en un caracter vacío


    }
}
