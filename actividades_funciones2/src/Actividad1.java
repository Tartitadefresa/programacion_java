import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el radio del cilindro:");
        int radio = sc.nextInt();
        
        System.out.println("Introduce la altura del cilindro:");
        int altura = sc.nextInt();
        
        sc.nextLine();
        System.out.println("Introduce el calculo a realizar: área o volumen");
        String elegir = sc.nextLine();

        sc.close();
        System.out.println (resultadoCalculo(elegir, radio, altura));
    }
    
    public static String resultadoCalculo(String opciones, int radio, int altura) {
        double area = 0;
        double volumen = 0;
        
        
        switch (opciones) {
            case "area":
                area = 2*Math.PI*radio*altura + 2*Math.PI*radio*radio;
                return "El resultado total del área es: " + area;
            
            case "volumen":
                volumen = Math.PI*radio*radio*altura;
                return "El resultado total del volumen es: " + volumen;
    
        }

        return "Valor invalido";
    }
}
        

        
