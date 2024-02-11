public class Canario extends Aves {
    
    protected String color;
    protected boolean canta;

    Canario(
        String nombre, 
        int edad, 
        String fechaNacimiento, 
        String color
    ) {
        super(nombre, edad, fechaNacimiento, "Corto");
        this.color = color;
        this.canta = false;
    }

    @Override
    public void muestra() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Fecha Nacimiento: " + this.fechaNacimiento);
        System.out.println("Color: " + this.color);
        System.out.println("Canta: " + (this.canta ? "Sí" : "No"));
    }

    @Override
    public void habla() {
        this.estado = "Hablando";
        this.canta = true;
        System.out.println("El canario con nombre " + this.nombre + " está cantando");
    }

    @Override
    public void volar() {
        this.vuela = true;
        System.out.println("El canario con nombre " + this.nombre + " está volando");
    }
    
}
