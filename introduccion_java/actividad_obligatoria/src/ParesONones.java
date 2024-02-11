import java.util.Scanner;

public class ParesONones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contUsuario = 0;    //Defino las variables para poder sumar las victorias
        int contOrdenador = 0;
        

        for (int i = 0; i < 5; i++) {     //Hacemos un for para poder realizar las 5 partidas
            int numeros = 0;
            String paresONones = "";

            while(true) {              //El while para repetir si el usuario no pone las opciones que pide
                System.out.println("Introduce pares o nones: ");
                paresONones = sc.next();
    
                if (paresONones.equals("pares") || paresONones.equals("nones")) {
                    break;               
                } else {
                    System.out.println("Opción incorrecta");
                }
            }
    
            while(true) {      //Este while para pedir al usuario un número entre 0 y 50, si no esta enttre este rango volverlo a pedir
                System.out.println("Introduce un número entre 0 y 50: ");
                numeros = sc.nextInt();
                if (numeros <= 50 && numeros >= 0) {
                    break;
                } else {
                    System.out.println("El número introducido no es correcto");
                }
            }
    
            int numeroAleatorio = (int) (Math.random() * ((50 + 1) - 0)) + 0;  //Math random para generar un número aleatorio entre 0 y 50 para el ordenador
            
            switch (paresONones) {           //En el caso de que el número aleatorio y el que nosotros hemos introducido 
                case "pares":                //sea par y hemos elegido "pares", se suma uno al contUsuario. Si no se suma al contOrdenador.
                    if ((numeroAleatorio + numeros)%2 == 0) {
                        contUsuario++;
                    } else {
                        contOrdenador++;
                    } 
                    break;
            
                case "nones":                                  //En el caso de que el número aleatorio y el que nosotros hemos introducido 
                    if ((numeroAleatorio + numeros)%2 != 0) {  //sea impar y hemos elegido "nones", se suma uno al contOrdenador. Si no se suma al contUsuario.
                        contUsuario++;
                    } else {
                        contOrdenador++;
                    } 
                    break;
            }

            System.out.println("Resultado: Usuario " + contUsuario + " | Máquina " + contOrdenador);
        }


        if (contOrdenador > contUsuario) {       //Si contOrdenador es mayor que contUsuario ha ganado la máquina, sino es mayor ha ganado el usuario
            System.out.println("El ganador es la máquina.");
        } else {
            System.out.println("El ganador es el usuario.");
        }

        sc.close();
    }
}
