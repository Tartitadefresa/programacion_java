public class FuncionesArrays {
    public static int[] generaArrayInt(int tamañoArray) {
        int[] array = new int[tamañoArray];

        for(int i = 0; i < tamañoArray; i++) {
            int random = (int)(Math.random() * 101);
            array[i] = random;
        }

        return array;
    }

    public static int minimoArrayInt(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        
        return min;
    }

    public static int maximoArrayInt(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
           if (array[i] > max) {
            max = array[i];
           }
        }
        return max;
    }

    public static int mediaArrayInt(int[] array) {
        int media = 0;

        for (int i = 0; i < array.length; i++) {
            media = media + array[i]; 
        }
        
        media = media / array.length;

        return media;
    }

    public static boolean estaEnArrayInt(int[] array, int numeroBuscado) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numeroBuscado) {
                return true;
            }
        }
        return false;
    }

    public static int posicionEnArray(int[] array, int numeroBuscado) {
        for (int i = 0; i < array.length; i++) {
            if (numeroBuscado == array[i]) {
                return i;
            }
        }

        return -1;
    }

    public static int[] volteaArrayInt(int[] array) {
        int[] arrayVolteada = new int[array.length];

        for (int i = 0; i < array.length; i--) {
            if (i == array.length - 1) {
                arrayVolteada[i] = array[0];
            } else {
                arrayVolteada[i] = array[(array.length - 1) - i]; 
            }
        }

        return arrayVolteada;
    }
     
}
