public class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche(String marca, String modelo, int unidades, double precio, int fechaRegistro, int potencia, int numeroPuertas) {
        super(marca, modelo, unidades, precio, fechaRegistro, potencia);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getCodigoRegistro() {
        return getMarca() + " <-> " + getModelo() + " (" + getNumeroPuertas() + ")";
    }

    public String getNombreSimple() {
        String marca = getMarca();
        return marca.substring(0, 3).toUpperCase();
    }

}
