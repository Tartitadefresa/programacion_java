public class AppPerros {
    public static void main(String[] args) {
        
            try {
                Perro perro1 = new Perro();
                perro1.setNombre("Max");
                perro1.setEdad(5);
                
                Perro perro2 = new Perro();
                perro2.setNombre("Bella");
                perro2.setEdad(3);
                
                Perro perro3 = new Perro();
                perro3.setNombre("");
                perro3.setEdad(-1);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        
    }
