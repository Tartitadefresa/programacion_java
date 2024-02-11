public class CuentaBancaria {
    private int identificador;
    private double cantidad;
    private Persona[] propietarios;

    public CuentaBancaria(int identificador) {
        this.identificador = identificador;
        this.cantidad = 0;
        this.propietarios = new Persona[2];
    }

    public void ingresar(double cantidad) {
        this.cantidad += cantidad;
    }

    public void ingresarCantidad(double cantidad) {
        this.cantidad += cantidad;
    }

    public void retirarCantidad(double cantidad) {
        if (cantidad <= this.cantidad) {
            this.cantidad -= cantidad;
        } else {
            System.out.println("No hay suficiente saldo en la cuenta.");
        }
    }

    public void obtenerTotal() {
        System.out.println("El total de la cuenta es: " + this.cantidad);
    }

    public void añadirPropietario(Persona persona) {
        for (int i = 0; i < propietarios.length; i++) {
            if (propietarios[i] == null) {
                propietarios[i] = persona;
                System.out.println("Usuario añadido con éxito.");
                return;
            }
        }

        System.out.println("No se ha podido añadir el propietario.");
        
    }

    public Persona[] getPropietarios() {
        return propietarios;
    }

    public String getInfoCuenta() {
        return "Id_Cuenta: " + identificador + ", Total_almacenado: " + cantidad;
    }

    public int getIdentificador() {
        return identificador;
    }
}


