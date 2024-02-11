public class Pizza {
    private String tamaño;
    private String tipo;
    private String estado;

    Pizza(String tamaño, String tipo) {
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.estado = "pedida";
    }

    public void servirPizza() {
        this.estado = "servida";
    }

    public void modificarTamaño() {
        if (this.tamaño.equals("mediana")) {
            this.tamaño = "familiar";
        } else {
            this.tamaño = "mediana";
        }
    }

    public void mostrarPizza() {
        System.out.println(
            "Tamaño: " + this.tamaño + 
            "\nTipo: " + this.tipo + 
            "\nEstado: " + this.estado
        );
    }
}
