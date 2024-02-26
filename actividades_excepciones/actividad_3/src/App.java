public class App {
    public static void main(String[] args) {
            try {
                imprimePositivo(5);
                imprimeNegativo(0);
            } catch (Exception e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        }

        public static void imprimePositivo(int p) throws Exception {
            if (p < 0) {
                throw new Exception("p debe ser un valor positivo");
            }
            System.out.println("Valor positivo: " + p);
        }

        public static void imprimeNegativo(int n) throws Exception {
            if (n >= 0) {
                throw new Exception("n debe ser un valor negativo");
            }
            System.out.println("Valor negativo: " + n);
        }
        
    }
