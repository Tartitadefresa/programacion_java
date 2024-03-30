public class Entrenador extends ComponenteEquipo {
    private int palmares;

    public Entrenador(int identificador, String nombre, int edad, String nacionalidad, int palmares) {
        super(identificador, nombre, edad, nacionalidad);
        this.palmares = palmares;
    }

    public int getPalmares() {
        return palmares;
    }

    public void setPalmares(int palmares) {
        this.palmares = palmares;
    }

    @Override
    public String toString() {
        return "-  Entrenador: " + this.getNombre();
    }
}
