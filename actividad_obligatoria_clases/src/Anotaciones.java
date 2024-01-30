public class Anotaciones {
    private String titulo;
    private String textoAnotacion;
    private boolean esImportante;
    private Persona autor;

    Anotaciones() {
        this.titulo = "sin_titulo";
        this.textoAnotacion = "no_introducido";
        this.esImportante = false;
        this.autor = null;
    }
    
    Anotaciones(String titulo, String textoAnotacion, Persona persona) {
        this.titulo = titulo;
        this.textoAnotacion = textoAnotacion;
        this.esImportante = false;
        this.autor = persona;
    }

    public String toString() {
        return this.titulo + " " + this.autor.toString() + "\n"
            + this.textoAnotacion + "\n" + this.esImportante;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public boolean getEsImportante() {
        return this.esImportante;
    }

    public void setEsImportante(boolean esImportante) {
        this.esImportante = esImportante;
    }
    
    
}