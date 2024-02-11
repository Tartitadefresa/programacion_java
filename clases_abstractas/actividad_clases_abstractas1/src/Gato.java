public class Gato extends Mascotas {
    protected String color;
    protected boolean peloLargo;

    Gato(String nombre, int edad, String fechaNacimiento, String color, boolean peloLargo) {
        super(nombre, edad ,fechaNacimiento);
        this.color = color;
        this.peloLargo = peloLargo;
    }

    @Override
    public void muestra() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Fecha Nacimiento: " + this.fechaNacimiento);
        System.out.println("Color: " + this.color);
        System.out.println("PeloLargo: " + (this.peloLargo ? "Sí" : "No"));
    }

    @Override
    public void habla() {
        this.estado = "Hablando";
        System.out.println("El gato con nombre " + this.nombre + " esta hablado.");
    }
}
