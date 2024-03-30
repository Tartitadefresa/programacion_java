public class Camioneta extends Vehiculo{
    private int capacidadCarga;

    public Camioneta(String marca, String modelo, int unidades, double precio, int fechaRegistro, int potencia, int capacidadCarga) {
        super(marca, modelo, unidades, precio, fechaRegistro, potencia);
        this.capacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public String getCodigoRegistro() {
        return getMarca() + " <-> " + getModelo();
    }

    public String getNombreSimple() {
        String marca = getMarca();
        return marca.substring(0, 3).toUpperCase();
    }
}
