import java.util.Arrays;

public class Actividad1 {

    public static void main(String[] args) {
        int[] num = new int[12];
        
        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;

        System.out.println(Arrays.toString(num));

        //Los valores de los elementos que no hemos inicializado salen como 0


    }
}
