public class Articulos {
    private int identificador;
    private String nombre;
    private float peso;

    public Articulos(int identificador, String nombre, float peso) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.peso = peso;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String toString() {
        return nombre + " (" + peso + ")";
    }
}

