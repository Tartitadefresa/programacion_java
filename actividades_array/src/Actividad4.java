public class Actividad4 {
    public static void main(String[] args) {
        int arrayLength = 20;
        int[] numero = new int[arrayLength];
        int[] cuadrado = new int[arrayLength];
        int[] cubo = new int[arrayLength];
        String resultado = "";

        for(int i = 0; i < arrayLength; i++) {
            int random = (int)(Math.random() * 101);

            numero[i] = random;
            cuadrado[i] = random * random;
            cubo[i] = random * random * random;

            resultado = resultado + numero[i] + ", " + cuadrado[i] + ", " + cubo[i] + "\n";
        }

        System.out.println(resultado);


    }
}
