public class Loro extends Aves {

    protected String origen;
    protected boolean habla;

    Loro(
        String nombre, 
        int edad, 
        String fechaNacimiento,
        String origen
    ) {
        super(nombre, edad, fechaNacimiento, "Largo");
        this.habla = false;
    }

    @Override
    public void muestra() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Fecha Nacimiento: " + this.fechaNacimiento);
        System.out.println("Origen: " + this.origen);
        System.out.println("Habla: " + (this.habla ? "Sí" : "No"));
    }

    public void saluda(String nombre) {
        System.out.println("Hola! " + nombre);
    }

    @Override
    public void volar() {
        this.vuela = true;
        System.out.println("El loro con nombre " + this.nombre + " está volando");
    }
    
}
