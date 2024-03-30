import java.util.ArrayList;
import java.time.LocalDateTime;
import exceptions.NuevoProductoException;

public class Taller {
    private String nombre;
    private int CIF;
    private ArrayList<Vehiculo> vehiculos;

    public Taller(String nombre, int CIF) {
        this.nombre = nombre;
        this.CIF = CIF;
        this.vehiculos = new ArrayList<Vehiculo>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getCIF() {
        return CIF;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCIF(int CIF) {
        this.CIF = CIF;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void registrarVehiculo(Vehiculo vehiculo) throws NuevoProductoException {
        LocalDateTime fechaRegistro = LocalDateTime.now();

        for (Vehiculo v : vehiculos) {
            if (v.getMarca().equalsIgnoreCase(vehiculo.getMarca()) && v.getModelo().equalsIgnoreCase(vehiculo.getModelo())) {
                throw new NuevoProductoException("Ya existe un vehiculo con la misma marca y modelo en el taller.");
            }
        }

        if (vehiculo instanceof Camioneta) {
            Camioneta camioneta = (Camioneta) vehiculo;
            if (camioneta.getCapacidadCarga() > 10000) {
                throw new NuevoProductoException("La camioneta no puede soportar más de 10000kj.");
            }
        }

        vehiculos.add(vehiculo);
    }
    public ArrayList<Vehiculo> listarVehiculosPorPrecio(double min, double max) {
        ArrayList<Vehiculo> vehiculosPorPrecio = new ArrayList<>();

        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPrecio() >= min && vehiculo.getPrecio() < max) {
                vehiculosPorPrecio.add(vehiculo);
            }
        }

        return vehiculosPorPrecio;
    }

    public boolean eliminarUnidadVehiculo(String marca, String modelo) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMarca().equalsIgnoreCase(marca) && vehiculo.getModelo().equalsIgnoreCase(modelo)) {
                vehiculos.remove(vehiculo);
                return true;
            }
        }
        return false;
    }

    public String listarVehiculosPorTipo(String tipo) {
        StringBuilder result = new StringBuilder();
        result.append("VEHICULOS REGISTRADOS DE TIPO: ").append(tipo).append("\n");

        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getClass().getSimpleName().equalsIgnoreCase(tipo)) {
                result.append(vehiculo.getFechaRegistro()).append("\t");
                result.append(vehiculo.getMarca()).append(" <-> ").append(vehiculo.getModelo()).append("\n");
            }
        }

        return result.toString();
    }

    public String getInfoTaller() {
        StringBuilder info = new StringBuilder();
        info.append(nombre).append(" (").append(CIF).append(") - ").append(vehiculos.size()).append(" vehiculos\n");

        for (Vehiculo vehiculo : vehiculos) {
            info.append("- ");
            if (vehiculo instanceof Coche) {
                Coche coche = (Coche) vehiculo;
                info.append("🚗 ").append(coche.getMarca()).append(" - ").append(coche.getModelo()).append(" - ").append(coche.getNumeroPuertas()).append(" puertas (").append(coche.getUnidades()).append(" unidades)");
            } else if (vehiculo instanceof Camioneta) {
                Camioneta camioneta = (Camioneta) vehiculo;
                info.append("🚚 ").append(camioneta.getMarca()).append(" - ").append(camioneta.getModelo()).append(" - ").append(camioneta.getCapacidadCarga()).append(" kg (").append(camioneta.getUnidades()).append(" unidades)");
            } else if (vehiculo instanceof Moto) {
                Moto motocicleta = (Moto) vehiculo;
                info.append("🏍️ ").append(motocicleta.getMarca()).append(" - ").append(motocicleta.getModelo()).append(" - ").append(motocicleta.getNumeroPersonas()).append(" personas (").append(motocicleta.getUnidades()).append(" unidades)");
            }
            info.append("\n");
        }

        return info.toString();
    }
}