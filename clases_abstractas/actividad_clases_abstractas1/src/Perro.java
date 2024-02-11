public class Perro extends Mascotas {
    protected String raza;
    protected boolean pulgas;

    Perro(String nombre, int edad, String fechaNacimiento, String raza, boolean pulgas) {
        super(nombre, edad, fechaNacimiento);
        this.raza = raza;
        this.pulgas = pulgas;
    }

    @Override
    public void muestra() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Fecha Nacimiento: " + this.fechaNacimiento);
        System.out.println("Raza: " + this.raza);
        System.out.println("Pulgas: " + (this.pulgas ? "Sí" : "No"));
    }

    @Override
    public void habla() {
        this.estado = "Hablando";
        System.out.println("El perro con nombre " + this.nombre + " esta hablado");
    }
}
