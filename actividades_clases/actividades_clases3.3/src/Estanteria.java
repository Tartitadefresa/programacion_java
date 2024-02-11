public class Estanteria {
    private int identificador;
    private String descripcion;
    private float ancho;
    private float alto;
    private Articulos[] articulos = new Articulos[5];

    public Estanteria(int identificador, String descripcion, float ancho, float alto) {
        this.identificador = identificador;
        this.descripcion = descripcion;
        this.ancho = ancho;
        this.alto = alto;
    }

    public boolean añadirArticulo(Articulos articulo) {
        for(int i = 0; i < articulos.length; i++) {
            if (articulos[i] == null) {
                articulos[i] = articulo;
                return true;
            }
        }

        return false;
    }

    public boolean eliminarArticulo(int identificador) {
        for(int i = 0; i < articulos.length; i++) {
            if (articulos[i] != null && articulos[i].getIdentificador() == identificador) {
                articulos[i] = null;
                return true;
            }
        }

        return false;
    }
    
    public int totalArticulosAlmacenados() {
        if (articulos != null) {
            return articulos.length;
        } else {
            return 0;
        }
    }
    
    public float pesoTotal() {
        float pesoTotal = 0;
        for (Articulos articulo : articulos) {
            if (articulo != null) {
                pesoTotal += articulo.getPeso();
            }
        }
        return pesoTotal;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estantería ").append(identificador).append(":\n");
        sb.append(descripcion).append("\n");
        sb.append("Ancho: ").append(ancho).append("\n");
        sb.append("Alto: ").append(alto).append("\n");
        sb.append("Peso total: ").append(pesoTotal()).append("\n");
        sb.append("Artículos almacenados:\n");
        for (int i = 0; i < articulos.length; i++) {
            if (articulos[i] != null) {
                sb.append(i + 1).append(". ").append(articulos[i].getNombre()).append(" (").append(articulos[i].getPeso()).append(")\n");
            }
        }
        return sb.toString();
    }
    
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public Articulos[] getArticulos() {
        return articulos;
    }

    public void setArticulos(Articulos[] articulos) {
        this.articulos = articulos;
    }
}