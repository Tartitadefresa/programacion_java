public abstract class Aves extends Mascotas {
    protected String pico;
    protected boolean vuela;

    Aves(String nombre, int edad, String fechaNacimiento, String pico) {
        super(nombre, edad, fechaNacimiento);
        this.pico = pico;
        this.vuela = false;
    }

    public void volar() {
        this.vuela = true;
        System.out.println("El ave con nombre " + this.nombre + " está volando");
    }
}
