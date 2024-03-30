public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int unidades;
    private double precio;
    private int fechaRegistro;
    private int potencia;

    public Vehiculo(String marca, String modelo, int unidades, double precio, int fechaRegistro, int potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.unidades = unidades;
        this.precio = precio;
        this.fechaRegistro = fechaRegistro;
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getUnidades() {
        return unidades;
    }

    public double getPrecio() {
        return precio;
    }

    public int getFechaRegistro() {
        return fechaRegistro;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setFechaRegistro(int fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

}
